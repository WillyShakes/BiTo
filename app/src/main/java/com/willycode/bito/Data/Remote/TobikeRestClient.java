package com.willycode.bito.Data.Remote;

import com.willycode.bito.Data.Model.ToBikeNetwork;

import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * Created by Manuel ELO'O on 09/01/2016.
 */


public class TobikeRestClient {
    private TobikeInterface tobikeInterface;

    public TobikeInterface getRestClient(){
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(TobikeInterface.ENDPOINT)
                .build();
        tobikeInterface = restAdapter.create(TobikeInterface.class);
        return tobikeInterface;
    }
}
