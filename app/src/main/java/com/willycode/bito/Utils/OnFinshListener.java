package com.willycode.bito.Utils;

import com.willycode.bito.Data.Model.Station;

import java.util.List;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public interface OnFinshListener {
        void onFinished(List<Station> stations);
        void onError(Exception error);
}
