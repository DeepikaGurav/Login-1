package com.example.alfiya.login;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ALFIYA on 16/01/2018.
 */

public class DatabaseHelper {

    SQLiteDatabase db;
    SQLiteDatabase db1;
    public class SqHelper extends SQLiteOpenHelper{


        public SqHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String s="Create table User(username text,password text)";
           db.execSQL(s);


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

    }
    public DatabaseHelper(Context context){
SqHelper obj=new SqHelper(context,"Mydb",null,1);
        db=obj.getWritableDatabase();
        db1=obj.getReadableDatabase();



    }


    public void InsertUser(String name,String password)
    {
        db.execSQL("Insert into User (username,password) values ('" + name + "',' "+password+"')");
        db.close();
    }


    public Cursor SelectUser()
    {
        return db.rawQuery("Select * from User",null);
    }











}
