package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestIntentReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent_receiver);

        TextView txtUrl = findViewById(R.id.txtUrl);
        Button btnLike = findViewById(R.id.btnLike);
        Button btnDislike = findViewById(R.id.btnDisLike);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        txtUrl.setText(url);

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("like", true);
                setResult(Activity.RESULT_OK, intent1);
                finish();
            }
        });

        btnDislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("like", false);
                setResult(Activity.RESULT_OK, intent1);
                finish();
            }
        });

    }
}