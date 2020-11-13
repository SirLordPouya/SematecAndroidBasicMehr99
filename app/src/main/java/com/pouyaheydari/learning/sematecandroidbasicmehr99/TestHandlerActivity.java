package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestHandlerActivity extends AppCompatActivity {

    Boolean isBackPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);
    }

    @Override
    public void onBackPressed() {
        if (isBackPressed == true)
            super.onBackPressed();
        else {
            isBackPressed = true;
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    isBackPressed = false;
                }
            }, 2500);
        }
    }
}