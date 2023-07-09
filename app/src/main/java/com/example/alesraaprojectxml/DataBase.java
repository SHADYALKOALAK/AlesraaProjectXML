package com.example.alesraaprojectxml;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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
    private static final int DB_VERSION = 3;
    public static final String TN_COMMENT = "comment";
    public static final String COL_COMMENT = "comment";

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String table_comment = " create table " + TN_COMMENT + "(" +
                COL_ID + " integer primary key autoincrement, " +
                COL_COMMENT + " text " + ")";
        db.execSQL(table_comment);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TN_COMMENT);
        onCreate(db);
    }

    public boolean insertComment(CommentsModel model) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("comment", model.getComment());
        long re = database.insert(TN_COMMENT, null, values);
        return re != -1;
    }

    public Cursor getComment() {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery(TN_COMMENT, null, null);
        return cursor;
    }
}
