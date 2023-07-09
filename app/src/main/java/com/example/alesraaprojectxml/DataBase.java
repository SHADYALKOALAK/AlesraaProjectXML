package com.example.alesraaprojectxml;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "E_learning_DataBse";
    private static final String Table_NAME = "user_data";
    private static final String COL_ID = "idComment";
    private static final String COL_NAME = "user_name";
    private static final String COL_EMAIL = "user_email";
    private static final String COL_PASSWORD = "user_password";
    private static final int DB_VERSION = 1;
    public static final String TN_COMMENT = "comment";
    public static final String COL_COMMENT = "comment";

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TN_COMMENT + " ( " + COL_ID + " Primary key AUTOINCREMENT, "
                + COL_COMMENT + " TEXT" + ") ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TN_COMMENT);
    }
}
