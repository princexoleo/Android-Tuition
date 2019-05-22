package com.leo.classseven.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "SabujDatabase.db";
    public static final String TABLE_NAME = "Users_Table";
    public static final String COL_1 = "username";
    public static final String COL_2 = "password";
    public static final String COL_3 = "email";
    public static final String COL_4 = "phone";
    public static final String ID_COL = "user_id";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
    public static final  int DATABASE_VERSION = 1 ;
    public Context context ;


    public MyDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
         this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // to create  database table.
       try{
           String create_table ="CREATE TABLE "+TABLE_NAME+"("+ID_COL+"INTEGER PRIMARY KEY AUTOINCREMENT,"+
                   COL_1+" VARCHAR(255),"+COL_2+" VARCHAR(255), "+COL_3+" VARCHAR(255), "+COL_4+" VARCHAR(255));";

           db.execSQL(create_table);
       }catch (Exception e )
       {
           Toast.makeText(context, "Expception"+e, Toast.LENGTH_SHORT).show();
       }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //to update database..
        try{
            db.execSQL(DROP_TABLE);
        }catch (Exception e)
        {
            Toast.makeText(context,"Exception is: "+e,Toast.LENGTH_LONG).show();
        }

    }

    public boolean insertData(String username, String pass, String email, String phone ){

        SQLiteDatabase sDB = this.getWritableDatabase();

        ContentValues conValue = new ContentValues();

        conValue.put(COL_1, username);
        conValue.put(COL_2, pass);
        conValue.put(COL_3, email);
        conValue.put(COL_4, phone);

        long res;

        res = sDB.insert(TABLE_NAME, null,conValue);

        if (res == -1){
            return false;
        }else{
            return true;
        }
    }
    public Cursor displayAllData()
    {
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return cursor;
    }
}
