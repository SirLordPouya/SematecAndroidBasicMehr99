package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestDrawerLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_drawer_layout);

        VideoView video = findViewById(R.id.video);
        Button btnStart = findViewById(R.id.btnStart);

        final String url = "https://hw3.cdn.asset.aparat.com/aparat-video/b7e9ef7896ef8251f5eb92c534913ee126623011-144p.mp4";

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestDrawerLayoutActivity.this, TestIntentReceiverActivity.class);
                intent.putExtra("url", url);
                startActivityForResult(intent, 2000);
            }
        });

        video.setMediaController(new MediaController(TestDrawerLayoutActivity.this));
        video.setVideoURI(Uri.parse(url));
        video.start();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2000) {
            if (resultCode == Activity.RESULT_OK) {
                Boolean like = data.getBooleanExtra("like", false);
                String result = "";
                if (like == true) {
                    result = "You liked this video!";
                } else {
                    result = "You disliked this video!";
                }

                Toast.makeText(TestDrawerLayoutActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        }

    }
}