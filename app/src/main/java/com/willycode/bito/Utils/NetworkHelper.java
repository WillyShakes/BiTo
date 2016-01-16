package com.willycode.bito.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.willycode.bito.Data.Model.Station;

import java.util.List;

/**
 * Created by Manuel ELO'O on 09/01/2016.
 */
public class NetworkHelper {
    public static boolean isNetworkConnected(Context c) {
        ConnectivityManager cm =
                (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
    public static List<Station> allStations;
}
