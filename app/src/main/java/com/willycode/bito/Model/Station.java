package com.willycode.bito.Model;

import android.provider.SyncStateContract;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Wilfried on 05/01/2016.
 *       {
 "empty_slots": 10,
 "extra": {
 "description": "Piazza Bernini"
 },
 "free_bikes": 3,
 "id": "a87ae87d44ff6d51dc8d60019348753c",
 "latitude": 45.076145826956605,
 "longitude": 7.6555578970445595,
 "name": "Bernini",
 "timestamp": "2016-01-05T22:20:11.4Z"
 },
 *
 */
public class Station {
    private int empty_slots;
    private String description;
    private int free_bikes;
    private int id;
    private String latitude;
    private String longitude;
    private String name;
    private String timestamp;

    private final String EMPTY_SLOT = "empty_slots";
    private final String EXTRA = "extra";
    private final String DESC = "description";
    private final String FREE_BIKES = "free_bikes";
    private final String ID = "id";
    private final String LAT = "latitude";
    private final String LNG = "longitude";
    private final String NAME = "name";
    private final String TIMESTAMP = "timestamp";


    public JSONObject toJson() throws JSONException {
        JSONObject ret = new JSONObject();
        ret.put(EMPTY_SLOT,empty_slots);
        JSONObject extra = new JSONObject();
        extra.put(DESC,description);
        ret.put(EXTRA,extra);
        ret.put(FREE_BIKES,free_bikes);
        ret.put(ID,id);
        ret.put(LAT,latitude);
        ret.put(LNG,longitude);
        ret.put(NAME,name);
        ret.put(TIMESTAMP,timestamp);
        return ret;
    }

    public Station(JSONObject station) throws JSONException {
        setEmpty_slots(station.getInt(EMPTY_SLOT));
        setDescription(station.getJSONObject(EXTRA).getString(DESC));
        setFree_bikes(station.getInt(FREE_BIKES));
        setId(station.getInt(ID));
        setLatitude(station.getString(LAT));
        setLongitude(station.getString(LNG));
        setName(station.getString(NAME));
        setTimestamp(station.getString(TIMESTAMP));
    }

    public int getEmpty_slots() {
        return empty_slots;
    }

    public void setEmpty_slots(int empty_slots) {
        this.empty_slots = empty_slots;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFree_bikes() {
        return free_bikes;
    }

    public void setFree_bikes(int free_bikes) {
        this.free_bikes = free_bikes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
