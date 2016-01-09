package com.willycode.bito.Data;

import android.app.IntentService;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;

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
        if (!isNetworkConnected(this)) {
            // Send log event : "Sync canceled, connection not available"
        }
        mDataManager.syncStations();
    }

    private boolean isNetworkConnected(SyncService syncService) {
        ConnectivityManager cm =
                (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
