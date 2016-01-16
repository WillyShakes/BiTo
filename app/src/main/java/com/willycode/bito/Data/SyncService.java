package com.willycode.bito.Data;

import android.app.IntentService;
import android.content.Intent;

import com.squareup.otto.Bus;
import com.willycode.bito.Utils.EventPosterHelper;
import com.willycode.bito.Utils.Events.LogEvent;
import com.willycode.bito.Utils.NetworkHelper;

/**
 * Created by Manuel ELO'O on 09/01/2016.
 */

public class SyncService extends IntentService {

    /**
     * A constructor is required, and must call the super IntentService(String)
     * constructor with a name for the worker thread.
     */
    DataManager mDataManager;
    public SyncService() {
        super("SyncIntentService");
        mDataManager = DataManager.getInstance();
    }

    /**
     * The IntentService calls this method from the default worker thread with
     * the intent that started the service. When this method returns, IntentService
     * stops the service, as appropriate.
     */
    @Override
    protected void onHandleIntent(Intent intent) {
        // do some work here, like download a file.
        if (!NetworkHelper.isNetworkConnected(getApplicationContext())) {
            LogEvent event = new LogEvent("Sync canceled, connection not available");
            EventPosterHelper eph = new EventPosterHelper(new Bus());
            eph.postEventSafely(event);
        }
        mDataManager.syncStations();
    }


}
