package com.willycode.bito.Presenter.StationPicker;

import android.content.Context;

import com.willycode.bito.Model.Station;
import com.willycode.bito.Model.StationContract;
import com.willycode.bito.Utils.JsonParser;
import com.willycode.bito.Utils.OnFinshListener;

import org.json.JSONException;

import java.util.List;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */

public class StationPickerListInteractorImpl implements StationPickerListInteractor {

    @Override
    public void loadStations(OnFinshListener listener, Context c) throws JSONException {
        //TODO If internet get json from API
        JsonParser jp = new JsonParser();
        List<Station> stations = jp.getStations();
        listener.onFinished(stations);
    }

    @Override
    public void saveStation(Station s, Context c) {
        StationContract sc = new StationContract(c);
        try {
            sc.addStation(s);
        } catch (JSONException e) {

        }
    }
}
