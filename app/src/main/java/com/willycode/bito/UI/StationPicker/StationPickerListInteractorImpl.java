package com.willycode.bito.UI.StationPicker;

import android.content.Context;

import com.willycode.bito.Data.DataManager;
import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Data.Local.DatabaseHelper;
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
    public void saveStation(Station s,Context c) {
        DataManager dt = DataManager.getInstance();
        try {
            dt.addStation(s);
        } catch (JSONException e) {

        }
    }
}