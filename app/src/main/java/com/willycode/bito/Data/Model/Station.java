package com.willycode.bito.Data.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;


public class Station {

    @SerializedName("empty_slots")
    @Expose
    public Integer emptySlots;
    @SerializedName("extra")
    @Expose
    public Extra extra;
    @SerializedName("free_bikes")
    @Expose
    public Integer freeBikes;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("latitude")
    @Expose
    public Double latitude;
    @SerializedName("longitude")
    @Expose
    public Double longitude;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;

    public String getFavName() {
        return favName;
    }

    public void setFavName(String favName) {
        this.favName = favName;
    }

    public String favName = "";

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getEmptySlots() {
        return emptySlots;
    }

    public void setEmptySlots(Integer emptySlots) {
        this.emptySlots = emptySlots;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public Integer getFreeBikes() {
        return freeBikes;
    }

    public void setFreeBikes(Integer freeBikes) {
        this.freeBikes = freeBikes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final String EMPTY_SLOT = "empty_slots";
    private final String EXTRA = "extra";
    private final String DESC = "description";
    private final String FREE_BIKES = "free_bikes";
    private final String ID = "id";
    private final String LAT = "latitude";
    private final String LNG = "longitude";
    private final String NAME = "name";
    private final String TIMESTAMP = "timestamp";
    private final String FAVNAME = "fav_name";


    public JSONObject toJson() throws JSONException {
        JSONObject ret = new JSONObject();
        ret.put(EMPTY_SLOT,emptySlots);
        JSONObject extraJson = new JSONObject();
        extraJson.put(DESC,extra.getDescription());
        ret.put(EXTRA,extraJson);
        ret.put(FREE_BIKES,freeBikes);
        ret.put(ID,id);
        ret.put(LAT,latitude);
        ret.put(LNG,longitude);
        ret.put(NAME,name);
        ret.put(TIMESTAMP,timestamp);
        ret.put(FAVNAME,favName);
        return ret;
    }

    public Station(JSONObject station) throws JSONException {
        setEmptySlots(station.getInt(EMPTY_SLOT));
        JSONObject extraJson = station.getJSONObject(EXTRA);
        if(!extraJson.isNull(DESC))
        {
            extra = new Extra();
            extra.setDescription(extraJson.getString(DESC));
        }
        setFreeBikes(station.getInt(FREE_BIKES));
        setId(station.getString(ID));
        setLatitude(Double.valueOf(station.getString(LAT)));
        setLongitude(Double.valueOf(station.getString(LNG)));
        setName(station.getString(NAME));
        setTimestamp(station.getString(TIMESTAMP));
        if(!station.isNull(FAVNAME))
        {
            setFavName(station.getString(FAVNAME));
        }
    }
}
