package com.willycode.bito.UI.StationPicker;

import android.content.Context;

import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Utils.OnFinshListener;

import org.json.JSONException;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public interface StationPickerListInteractor {
    public void loadStations(OnFinshListener listener, Context c) throws JSONException;
    public void saveStation(Station station, Context c);
}
