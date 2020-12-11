package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class TestDatabaseActivity extends AppCompatActivity {

    String DB_NAME = "sematec";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        TestSqlite db = new TestSqlite(TestDatabaseActivity.this, DB_NAME, null, 1);
        db.insertStudent("Pouya", "Heydari", 90);
        db.insertStudent("Amin", "Rezae", 90);
        db.insertStudent("Fateme", "Fathi", 90);
        db.insertStudent("Nazanin", "Ghaznavi", 90);
        db.insertStudent("Rouzbeh", "Shafie", 90);
        db.insertStudent("Roya", "Ghaznavi", 90);
        db.insertStudent("Sajad", "Mirtaqi", 90);
        db.insertStudent("Sanaz", "Bahmani", 90);

        List<String> names = db.getAllStudents();
        for (int i = 0; i < names.size(); i++) {
            Toast.makeText(this, names.get(i), Toast.LENGTH_SHORT).show();
        }
    }
}