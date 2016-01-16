package com.willycode.bito.UI.FavoriteStation;

import android.content.Context;

import com.willycode.bito.Data.DataManager;
import com.willycode.bito.Utils.OnFinshListener;

import org.json.JSONException;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */

public class StationListInteractorImpl implements StationListInteractor{

    @Override
    public void loadStaions(OnFinshListener listener, Context c) {
        DataManager dt = DataManager.getInstance();
        try {
            listener.onFinished(dt.getStations());
        } catch (JSONException e) {
            listener.onError(e);
        }
    }
}
