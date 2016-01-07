package com.willycode.bito.Presenter.FavoriteStation;

import android.content.Context;

import com.willycode.bito.Model.Station;
import com.willycode.bito.Utils.OnFinshListener;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public interface StationListInteractor {
    public void loadStaions(OnFinshListener listener,Context c);
    public void addNewStation(Station station,Context c);
}
