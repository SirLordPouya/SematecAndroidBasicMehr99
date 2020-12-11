package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TestSqlite extends SQLiteOpenHelper {

    String TABLE_NAME = "students";
    String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT," +
            "family TEXT," +
            "grade INTEGER" +
            ")";

    public TestSqlite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertStudent(String name, String family, int grade) {
        String INSERT_STUDENT_QUERY = "INSERT INTO " + TABLE_NAME + "(name,family,grade)VALUES(" +
                "'" + name + "'" + "," +
                "'" + family + "'" + ","
                + grade + ")";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_STUDENT_QUERY);
        db.close();
    }

    public List<String> getAllStudents() {
        ArrayList<String> names = new ArrayList<>();
        String GET_ALL_STUDENTS_QUERY = "SELECT name FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(GET_ALL_STUDENTS_QUERY, null);

        while (cursor.moveToNext()) {
            String name = cursor.getString(0);
            names.add(name);
        }
        db.close();
        return names;
    }
}
