package com.example.add_storemenu;
import android.provider.BaseColumns;

public final class UserContact {
    public static final String DB_NAME = "restaurant.db";
    public static final int DATABASE_VERSION = 21;
    private static final String TEXT_TYPE = "TEXT";
    private static final String COMMA = ",";

    public static class Restaurant implements BaseColumns{
        //맛집
        public static final String TABLE_NAME = "Res";
        public static final String KEY_Rname = "Rname";
        public static final String KEY_Address = "Adress";
        public static final String KEY_Callnum = "Callnums";
        public static final String KEY_OpenTime = "OpenTime";
        public static final String KEY_PHOTO = "Photo";

        //메뉴
        public static final String TABLE_NAME2 = "Menus";
        public static final String KEY_MENU_ID = "Menu_Id";
        public static final String KEY_MENU_NAME = "Menu_Name";
        public static final String KEY_MENU_PRICE = "Menu_Price";
        public static final String KEY_MENU_DETAIL = "Menu_Detail";
        public static final String KEY_MENU_PHOTO = "Menu_Photo";

        //맛집테이블1
        public static final String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" +
                _ID + " INTEGER PRIMARY KEY" + COMMA +
                KEY_Rname + TEXT_TYPE + COMMA +
                KEY_Address + TEXT_TYPE + COMMA +
                KEY_Callnum + TEXT_TYPE + COMMA +
                KEY_OpenTime + TEXT_TYPE + COMMA +
                KEY_PHOTO + TEXT_TYPE  + ")";

        //맛집메뉴테이블2
        public static final String CREATE_TABLE2 = "CREATE TABLE" + TABLE_NAME2 + "(" +
                _ID + " INTEGER PRIMARY KEY" + COMMA +
                KEY_MENU_ID + TEXT_TYPE + COMMA+
                KEY_MENU_NAME + TEXT_TYPE + COMMA +
                KEY_MENU_PRICE + TEXT_TYPE + COMMA +
                KEY_MENU_DETAIL + TEXT_TYPE + COMMA +
                KEY_MENU_PHOTO + TEXT_TYPE  + ")";

        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS" + TABLE_NAME;
        public static final String DELETE_TABLE2 = "DROP TABLE IF EXISTS" + TABLE_NAME2;
    }
}

