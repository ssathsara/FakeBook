package com.example.facebook.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class MyDataBase extends SQLiteOpenHelper {

    //CREATE DATBASE NAME AND VERSION
    public static final String DB_NAME ="my_database_name";
    public static final int DB_VERSION =1;

    //CREATE TABLE NAME AND FIELDS
    public static final String STUDNET_TABLE ="student";

    public static final String STUDNET_NAME ="name";
    public static final String STUDNET_AGE ="age";
    public static final String STUDNET_MARKS ="marks";


    public MyDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
