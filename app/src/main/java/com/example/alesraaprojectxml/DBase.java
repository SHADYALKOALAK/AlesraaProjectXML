package com.example.alesraaprojectxml;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "E_learning_DataBse";
    private static final String Table_NAME = "user_data";
    private static final String COL_ID = "idComment";
    private static final String COL_NAME = "user_name";
    private static final String COL_EMAIL = "user_email";
    private static final String COL_PASSWORD = "user_password";
    private static final int DB_VERSION =5 ;
    public static final String TN_COMMENT = "comment";
    public static final String COL_COMMENT = "massage";

    public DBase(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TN_COMMENT + "(idComment integer Primary key AUTOINCREMENT,massage TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TN_COMMENT);
        onCreate(db);
    }

    public boolean insertComment(CommentsModel model) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_COMMENT, model.getComment());
        values.put(COL_ID, model.getIdComments());
        long re = database.insert(TN_COMMENT, null, values);
        return re != -1;
    }

    public Cursor getComment() {
        SQLiteDatabase dp = this.getReadableDatabase();
        Cursor cursor;
        cursor = dp.rawQuery(" Select * From " + TN_COMMENT, null);
        return cursor;
    }
}
