package com.willycode.bito.Presenter;

import android.content.Context;

import com.willycode.bito.Model.Station;
import com.willycode.bito.Model.StationContract;
import com.willycode.bito.Utils.OnFinshListener;

import org.json.JSONException;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */

public class StationListInteractorImpl implements StationListInteractor{

    @Override
    public void loadStaions(OnFinshListener listener, Context c) {
        StationContract sc = new StationContract(c);
        try {
            listener.onFinished(sc.getAllStations());
        } catch (JSONException e) {
            listener.onError(e);
        }
    }

    @Override
    public void addNewStation(Station s,Context c) {
        StationContract sc = new StationContract(c);
        try {
           sc.addStation(s);
        } catch (JSONException e) {

        }
    }
}
