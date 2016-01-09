package com.willycode.bito.Utils.Events;

import com.willycode.bito.Data.Model.Station;

import java.util.List;

/**
 * Created by Manuel ELO'O on 09/01/2016.
 */
public class GetListStationEvent {
    public final List<Station> stations;

    public GetListStationEvent(List<Station> list) {
        this.stations = list;
    }
}
