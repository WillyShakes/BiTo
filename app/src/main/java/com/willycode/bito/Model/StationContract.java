package com.willycode.bito.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manuel ELO'O on 05/01/2016.
 */
public class StationContract {


    private Context context;

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public StationContract(Context c) {
        this.context = c;
    }


    // Adding new Station
    public void addStation(Station station) throws JSONException {

        // Gets the data repository in write mode
        StationDbHelper mDbHelper = com.willycode.bito.Model.StationDbHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(StationDbHelper.StationEntry.COLUMN_NAME_ID, station.getId()); // Station Name
        values.put(StationDbHelper.StationEntry.COLUMN_NAME_JSON, station.toJson().toString()); // Station Phone Number
        // Inserting Row
        db.insert(com.willycode.bito.Model.StationDbHelper.StationEntry.TABLE_NAME, null, values);
        db.close(); // Closing database connection
    }


    // Getting All Stations
    public List<Station> getAllStations() throws JSONException {
        List<Station> StationList = new ArrayList<Station>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + StationDbHelper.StationEntry.TABLE_NAME;

        StationDbHelper mDbHelper = StationDbHelper.getInstance(context);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Station station;
                String json = cursor.getString(cursor.getColumnIndex(StationDbHelper.StationEntry.COLUMN_NAME_JSON));
                station = new Station(new JSONObject(json));
                // Adding Station to list
                StationList.add(station);
            } while (cursor.moveToNext());
        }

        // return Station list
        return StationList;
    }
}
