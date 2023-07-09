package com.example.alesraaprojectxml;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "E_learning_DataBse";
    public static final String Table_NAMEUSRT = "user_data";
    public static final String COL_ID = "idComment";
    public static final String COL_ID_USER = "idUser";
    public static final String COL_NAME = "user_name";
    public static final String COL_NUMBER = "numberUser";
    public static final String COL_PASSWORD = "user_password";
    public static final int DB_VERSION = 6;
    public static final String TN_COMMENT = "comment";
    public static final String COL_COMMENT = "massage";
    //DATA

    public DBase(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TN_COMMENT + "(idComment INTEGER Primary key AUTOINCREMENT,massage TEXT)");
        db.execSQL("CREATE TABLE " + Table_NAMEUSRT + " ( " + COL_ID_USER + " INTEGER Primary key AUTOINCREMENT , "
                + COL_NAME + " TEXT , "
                + COL_NUMBER + " TEXT , "
                + COL_PASSWORD + " TEXT) ");
        //
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TN_COMMENT);
        db.execSQL("DROP TABLE IF EXISTS " + Table_NAMEUSRT);
        onCreate(db);

    }

    public boolean insertComment(CommentsModel model) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("massage", model.getComment());
        long re = database.insert(TN_COMMENT, null, values);
        return re != -1;
        //
    }

    public Cursor getComment() {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery("Select * From " + TN_COMMENT, null);
        return cursor;
        //
    }

    public boolean insertUser(UserSignUpModel user) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, user.getUserName());
        contentValues.put(COL_PASSWORD, user.getPassword());
        contentValues.put(COL_NUMBER, user.getNumber());
        long re = sqLiteDatabase.insert(Table_NAMEUSRT, null, contentValues);
        return re != -1;
        //insertUser//
    }

    public Cursor getUser() {
        SQLiteDatabase dp = this.getReadableDatabase();
        Cursor cursor = dp.rawQuery("Select * From " + Table_NAMEUSRT, null);
        return cursor;
        //getUSER//
    }
}
