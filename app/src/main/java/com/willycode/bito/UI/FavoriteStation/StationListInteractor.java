package com.willycode.bito.UI.FavoriteStation;

import android.content.Context;

import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Utils.OnFinshListener;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public interface StationListInteractor {
    public void loadStaions(OnFinshListener listener,Context c);
}
