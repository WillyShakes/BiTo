package com.willycode.bito.UI.StationPicker;

import com.willycode.bito.Data.Model.Station;

import org.json.JSONException;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public interface StationPickerPresenter {
    public void onResume() throws JSONException;
    public void onItemCliked(Station station);
    void onDestroy();
}
