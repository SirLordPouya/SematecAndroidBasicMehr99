package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","onCreate");

        int a = 0;
        String s = "";
        Button btnSave = findViewById(R.id.btnSave);
        EditText edtName = findViewById(R.id.edtName);
        TextView txtTitle = findViewById(R.id.txtTitle);


        btnSave.setText("Save Name");
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Saved!",Toast.LENGTH_LONG).show();
            }
        });

        txtTitle.setText(HtmlCompat.fromHtml("<h2>Title</h2><br><p>Description here</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));

    }


}