package com.willycode.bito.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Manuel ELO'O on 05/01/2016.
 */
public class StationDbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Bito.db";
    private static StationDbHelper mDbHelper;

    /* Inner class that defines the table contents */
    public static abstract class StationEntry implements BaseColumns {
        public static final String TABLE_NAME = "Stations";
        public static final String COLUMN_NAME_ID = "stationid";
        public static final String COLUMN_NAME_JSON = "json";
    }
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + StationEntry.TABLE_NAME + " (" +
                    StationEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                    StationEntry.COLUMN_NAME_ID + TEXT_TYPE + COMMA_SEP +
                    StationEntry.COLUMN_NAME_JSON + TEXT_TYPE  +
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + StationEntry.TABLE_NAME;

    private StationDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized StationDbHelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (mDbHelper == null) {
            mDbHelper = new StationDbHelper(context.getApplicationContext());
        }
        return mDbHelper;
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}