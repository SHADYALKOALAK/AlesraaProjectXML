package com.example.alesraaprojectxml;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "E_learning_DataBse";
    private static final String Table_NAME = "user_data";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "user_name";
    private static final String COL_EMAIL = "user_email";
    private static final String COL_PASSWORD ="user_password";
    private static final int DB_VERSION = 1;

    public DataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {





    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
