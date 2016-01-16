package com.willycode.bito.Data;

import com.willycode.bito.Data.Local.DatabaseHelper;
import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Data.Model.ToBikeNetwork;
import com.willycode.bito.Data.Remote.TobikeInterface;
import com.willycode.bito.Utils.EventPosterHelper;
import com.willycode.bito.Utils.Events.GetListStationEvent;
import com.willycode.bito.Utils.Events.LogEvent;
import com.willycode.bito.Utils.Events.SyncFinishedEvent;
import com.willycode.bito.Utils.NetworkHelper;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


/**
 * Created by Manuel ELO'O on 09/01/2016.
 */

public class DataManager {

    private TobikeInterface mTobikeService;
    private DatabaseHelper mDatabaseHelper;
    private EventPosterHelper mEventPoster;

    private static DataManager instance = null;

    protected DataManager() {
        // Exists only to defeat instantiation.
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }


    public void setDataProvider(TobikeInterface tobikeService, DatabaseHelper databaseHelper, EventPosterHelper eventPosterHelper) {
        mTobikeService = tobikeService;
        mDatabaseHelper = databaseHelper;
        mEventPoster = eventPosterHelper;
    }


    public void syncStations() {
        mTobikeService.getStations(new Callback<ToBikeNetwork>() {
            @Override
            public void success(ToBikeNetwork toBikeNetwork, Response response) {
                if (response.getStatus() == 200) {
                    List<Station> stations = toBikeNetwork.getNetwork().getStations();
                    NetworkHelper.allStations = stations;
                    List<Station> toUpdate = new ArrayList<Station>();
                    try {
                        List<Station> internalStations = mDatabaseHelper.getAllStations();
                        for (int i = 0; i < internalStations.size(); i++) {
                            for (int j = 0; j < stations.size(); j++) {
                                if (internalStations.get(i).getId().equals(stations.get(j).getId())) {
                                    toUpdate.add(stations.get(j));
                                }
                            }
                        }
                        for (int j = 0; j < toUpdate.size(); j++) {
                            mDatabaseHelper.updateStation(toUpdate.get(j));
                        }
                        GetListStationEvent event = new GetListStationEvent(toUpdate);
                        mEventPoster.postEventSafely(event);
                    } catch (JSONException e) {
                        LogEvent event = new LogEvent(e.getMessage());
                        mEventPoster.postEventSafely(event);
                    }
                } else {
                    int statusCode = response.getStatus();
                    LogEvent event = new LogEvent(statusCode + " " + response.getReason());
                    mEventPoster.postEventSafely(event);
                }
                mEventPoster.postEventSafely(new SyncFinishedEvent());
            }

            @Override
            public void failure(RetrofitError error) {
                LogEvent event = new LogEvent(error.getMessage());
                mEventPoster.postEventSafely(event);
                mEventPoster.postEventSafely(new SyncFinishedEvent());
            }
        });
    }

    public List<Station> getStations() throws JSONException {
        return mDatabaseHelper.getAllStations();
    }

    public void addStation(Station s) throws JSONException {
        List<Station> list = mDatabaseHelper.getAllStations();
        Boolean exist = false;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(s.getId()))
            {
                exist = true;
                break;
            }
        }
        if(!exist)
            mDatabaseHelper.addStation(s);
    }

    public void updateStation(Station s) throws JSONException {
        mDatabaseHelper.updateStation(s);
    }
    public void postEvent(Object event){
        mEventPoster.postEventSafely(event);
    }

    public void deleteStation(Station station) {
        mDatabaseHelper.deleteStation(station);
    }
}
