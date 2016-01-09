package com.willycode.bito.Data;

import com.willycode.bito.Data.Local.DatabaseHelper;
import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Data.Model.ToBikeNetwork;
import com.willycode.bito.Data.Remote.TobikeInterface;
import com.willycode.bito.Utils.EventPosterHelper;
import com.willycode.bito.Utils.Events.GetListStationEvent;
import com.willycode.bito.Utils.Events.LogEvent;

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
                    } catch (JSONException e) {
                        LogEvent event = new LogEvent(e.getMessage());
                        mEventPoster.postEventSafely(event);
                    }

                    GetListStationEvent event = new GetListStationEvent(toUpdate);
                    mEventPoster.postEventSafely(event);
                } else {
                    int statusCode = response.getStatus();
                    LogEvent event = new LogEvent(statusCode + " " + response.getReason());
                    mEventPoster.postEventSafely(event);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                LogEvent event = new LogEvent(error.getMessage());
                mEventPoster.postEventSafely(event);
            }
        });
    }

    public List<Station> getStations() throws JSONException {
        return mDatabaseHelper.getAllStations();
    }

    public void addStation(Station s) throws JSONException {
        mDatabaseHelper.addStation(s);
    }
}
