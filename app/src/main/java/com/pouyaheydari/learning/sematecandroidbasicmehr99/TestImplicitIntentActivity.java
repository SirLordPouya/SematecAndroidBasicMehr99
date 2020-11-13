package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TestImplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_implicit_intent);

        Button btnBrowser = findViewById(R.id.btnBrowser);
        Button btnDialogActivity = findViewById(R.id.btnDialogActivity);

        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pouyaheydari.com"));
                startActivity(intent);
            }
        });

        btnDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestImplicitIntentActivity.this, TestDialogActivity.class);
                startActivity(intent);
            }
        });
    }
}