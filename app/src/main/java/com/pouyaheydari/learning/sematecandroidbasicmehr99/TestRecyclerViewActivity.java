package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);

        // internet / database / file
        ArrayList<String> names = new ArrayList<String>();
        names.add("Pouya Heydari");
        names.add("Amin Rezae");
        names.add("Fatemeh Fathi");
        names.add("Nazanin Ghaznavi");
        names.add("Rouzbeh Shafie");
        names.add("Roya Ghaznavi");
        names.add("Sajad Mirtaghi");
        names.add("Sanaz Bahmani");

        RecyclerView recycler = findViewById(R.id.recycler);

        LinearLayoutManager lm = new LinearLayoutManager(TestRecyclerViewActivity.this, RecyclerView.VERTICAL, false);
        recycler.setLayoutManager(lm);

        TestAdapter adapter = new TestAdapter(names);
        recycler.setAdapter(adapter);

//        Intent intent = new Intent(TestRecyclerViewActivity.this, TestService.class);
//        ContextCompat.startForegroundService(TestRecyclerViewActivity.this, intent);

        TestBroadcastReceiver receiver = new TestBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(receiver, filter);


        Intent intent = new Intent();
        intent.setAction("com.pouyaheydari.learning.sematecandroidbasicmehr99.ACTION_TEST_BROADCAST");
        sendBroadcast(intent);
    }
}