package com.willycode.bito.UI.FavoriteStation;

import com.willycode.bito.Data.Model.Station;

import java.util.List;

/**
 * Created by Manuel ELO'O on 05/01/2016.
 */
public interface StationListView {
    public void setStations(List<Station> stations);

    public void showMessage(String message);

    public void hideProgress() ;

    public void showProgress() ;
}
