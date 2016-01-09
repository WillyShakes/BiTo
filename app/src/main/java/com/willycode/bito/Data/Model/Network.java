
package com.willycode.bito.Data.Model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Network {

    @SerializedName("company")
    @Expose
    public String company;
    @SerializedName("href")
    @Expose
    public String href;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("stations")
    @Expose
    public List<Station> stations = new ArrayList<Station>();

    public List<Station> getStations() {
        return stations;
    }
}
