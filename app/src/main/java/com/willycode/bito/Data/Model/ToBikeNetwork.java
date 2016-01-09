
package com.willycode.bito.Data.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ToBikeNetwork {

    @SerializedName("network")
    @Expose
    public Network network;

    public Network getNetwork() {
        return network;
    }
}
