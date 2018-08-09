package com.naver.mycnex.mymall;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Address;

import java.util.Locale;

public class DBManager extends SQLiteOpenHelper {
    public DBManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {//테이블생성
        String query = "CREATE TABLE category (id INTEGER PRIMARY KEY AUTOINCREMENT, category_name TEXT);";//카테고리 정보,카테고리 이름

        db.execSQL(query);

        query = "CREATE TABLE category (id INTEGER PRIMARY KEY AUTOINCREMENT, category_name TEXT,price INTEGER,category_id INTEGER);";

        db.execSQL(query);


        String query = "insert into category values (1.'반팔');";

        db.execSQL(query);

        String query = "insert into category values (2.'긴팔');";

        db.execSQL(query);

        String query = "insert into category values (3.'바지');";

        db.execSQL(query);

        String query = "insert into category values (4.'액세서리');";

        db.execSQL(query);
        String query = "insert into category values (3.'바지');";

        db.execSQL(query);


        query = "insert into category values (1.'나이키바지');";

        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData(Locale.Category category) {

        SQLiteDatabase db = getReadableDatabase();

        String query = "insert into category values (null,'" +category.getName()+  "','" + category.getPrice() + "');";

        db.execSQL(query);
    }



}
