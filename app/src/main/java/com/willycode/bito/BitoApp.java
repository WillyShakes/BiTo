package com.willycode.bito;

import android.app.Application;

import com.squareup.otto.Bus;
import com.willycode.bito.Data.DataManager;
import com.willycode.bito.Data.Local.DatabaseHelper;
import com.willycode.bito.Data.Remote.TobikeInterface;
import com.willycode.bito.Data.Remote.TobikeRestClient;
import com.willycode.bito.Utils.EventPosterHelper;

/**
 * Created by Manuel ELO'O on 09/01/2016.
 */
public class BitoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DataManager dt = DataManager.getInstance();
        TobikeInterface tobikeService = new TobikeRestClient().getRestClient();
        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
        EventPosterHelper evPostHelper = new EventPosterHelper(new Bus());
        dt.setDataProvider(tobikeService,dbHelper,evPostHelper);
    }
}
