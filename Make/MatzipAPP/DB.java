package com.example.add_storemenu;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.*;
import android.util.*;

public class DB extends SQLiteOpenHelper {
    final static String TAG = "SQLiteDBTest";

    public DB(Context context){
        super(context, UserContact.DB_NAME, null, UserContact.DATABASE_VERSION);
    }
     @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, getClass().getName() + ".onCreate()");
        db.execSQL(UserContact.Restaurant.CREATE_TABLE);
        db.execSQL(UserContact.Restaurant.CREATE_TABLE2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.i(TAG, getClass().getName() + ".onUpgrade()");
        db.execSQL(UserContact.Restaurant.DELETE_TABLE);
        db.execSQL(UserContact.Restaurant.DELETE_TABLE2);
        onCreate(db);
    }

    public Cursor getAllResByMethod(){
        SQLiteDatabase db = getReadableDatabase();
        return db.query(UserContact.Restaurant.TABLE_NAME, null, null, null, null, null, null);
    }

    public Cursor getAllMenusByMethod(){
        SQLiteDatabase db = getReadableDatabase();
        return db.query(UserContact.Restaurant.TABLE_NAME2, null, null, null, null, null, null);
    }

    public Cursor getAllMenusBySQL(String resid){
        String sql = "Select * FROM " + UserContact.Restaurant.TABLE_NAME2 +
                " WHERE " + UserContact.Restaurant.KEY_MENU_ID + " LIKE " + resid;
        return getReadableDatabase().rawQuery(sql, null);
    }
    //Restaurant 추가시 작동 메소드
    public long insertUserByMethod(String Rname, String Add, String Callnum, String OpenTime, String Photo){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(UserContact.Restaurant.KEY_Rname, Rname);
        values.put(UserContact.Restaurant.KEY_Address, Add);
        values.put(UserContact.Restaurant.KEY_Callnum, Callnum);
        values.put(UserContact.Restaurant.KEY_OpenTime, OpenTime);
        values.put(UserContact.Restaurant.KEY_PHOTO, Photo);

        return db.insert(UserContact.Restaurant.TABLE_NAME, null, values);
    }
    //Menu추가시 작동 메소드
    public long insertMenuByMethod(String name, String price, String detail, String menu_photo, String menu_Id){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(UserContact.Restaurant.KEY_MENU_NAME, name);
        values.put(UserContact.Restaurant.KEY_MENU_PRICE, price);
        values.put(UserContact.Restaurant.KEY_MENU_DETAIL, detail);
        values.put(UserContact.Restaurant.KEY_PHOTO, menu_photo);
        values.put(UserContact.Restaurant.KEY_MENU_ID, menu_Id);

        return db.insert(UserContact.Restaurant.TABLE_NAME2, null, values);
    }

    //맛집 제거시
    public long deleteUserByMethod(String _id){
        SQLiteDatabase db = getWritableDatabase();

        String whereClause = UserContact.Restaurant._ID + " = ?";
        String[] whereArgs = {_id};
        return db.delete(UserContact.Restaurant.TABLE_NAME, whereClause, whereArgs);
    }
}
