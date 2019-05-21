package com.leo.classseven.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "SabujDatabase.db";
    public static final String TABLE_NAME = "Users_Table";
    public static final String COL_1 = "username";
    public static final String COL_2 = "password";
    public static final String COL_3 = "email";
    public static final String COL_4 = "phone";
    public static final String ID_COL = "user_id";
    public static final  int DATABASE_VERSION = 1 ;
   // public Context mContext ;


    public MyDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // this.mContext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // to create  database table.
        String create_table ="CREATE TABLE "+TABLE_NAME+"("+ID_COL+"INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COL_1+"VARCHAR(255),"+COL_2+"VARCHAR(255) ";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //to update database..

    }
}
