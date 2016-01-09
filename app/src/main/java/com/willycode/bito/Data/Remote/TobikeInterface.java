package com.willycode.bito.Data.Remote;

import com.willycode.bito.Data.Model.Station;
import com.willycode.bito.Data.Model.ToBikeNetwork;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;


/**
 * Created by Manuel ELO'O on 09/01/2016.
 */
public interface TobikeInterface {
    String ENDPOINT = "http://api.citybik.es/";

    @GET("/v2/networks/to-bike")
    public void getStations(Callback<ToBikeNetwork> response);
}
