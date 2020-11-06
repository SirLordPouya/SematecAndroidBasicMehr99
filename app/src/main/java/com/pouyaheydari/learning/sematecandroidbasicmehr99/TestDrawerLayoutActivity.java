package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestDrawerLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_drawer_layout);
        VideoView video = findViewById(R.id.video);
        String url = "https://hw3.cdn.asset.aparat.com/aparat-video/b7e9ef7896ef8251f5eb92c534913ee126623011-144p.mp4";

        video.setMediaController(new MediaController(TestDrawerLayoutActivity.this));
        video.setVideoURI(Uri.parse(url));
        video.start();

        Log.d("TAG", "onCreate: test");
    }
}