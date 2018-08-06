package com.example.sirohi.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sirohi on 7/20/17.
 */

public class Dbcontroller extends SQLiteOpenHelper {
    private static final String tablename = "Users";
    private static final String id = "id";
    private static final String name = "Name";
    private static final String Email = "Uemail";
    private static final String pass = "password";
    private static final String age = "password";
    private static final String height = "password";
    private static final String weight = "password";
    private static final String databasename = "UserInfo";
    private static final int versioncode = 1;


    public Dbcontroller(Context context) {
        super(context, databasename, null, versioncode);
    }



    @Override
    public void onCreate(SQLiteDatabase Database) {
        String query;
        query  = "CREATE TABLE IF NOT EXISTS " + tablename + "(" + id + " integer primary key, " + name + " text, " + Email + " text, " + pass + " text, " + age +
        " integer, "+ height + " integer, "+ weight + " integer)";
        Database.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase Database, int i, int i1) {
        String query;
        query = "DROP TABLE IF EXISTS " + tablename;
        Database.execSQL(query);
        onCreate(Database);

    }
    public ArrayList<HashMap<String, String>> getAllUsers(){
        ArrayList<HashMap<String, String>> wordList = new ArrayList<HashMap<String, String>>();
        SQLiteDatabase db = this.getWritableDatabase();
        String selectQuery = "SELECT * FROM " + tablename;

        Cursor cursor = db.rawQuery(selectQuery , null);
        if (cursor.moveToFirst()){
            do {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("ID", cursor.getString(0));
                map.put("UserID", cursor.getString(1));
                map.put("password", cursor.getString(2));

                wordList.add(map);
            }
            while( cursor.moveToNext());
        }
        return wordList;

    }


}
