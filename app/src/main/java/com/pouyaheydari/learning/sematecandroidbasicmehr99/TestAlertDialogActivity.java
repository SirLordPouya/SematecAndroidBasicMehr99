package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert_dialog);

        AlertDialog dialog = new AlertDialog.Builder(TestAlertDialogActivity.this)
                .setTitle("Attention!")
                .setMessage("Are you sure?!")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "Yes Clicked!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "No CLicked!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("I dont know!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "IDK clicked!", Toast.LENGTH_SHORT).show();
                    }
                }).create();
        dialog.show();
    }
}