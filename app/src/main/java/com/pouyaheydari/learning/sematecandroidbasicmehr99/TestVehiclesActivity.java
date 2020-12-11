package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.pouyaheydari.learning.sematecandroidbasicmehr99.pojo.Vehicle;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class TestVehiclesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_vehicles);

        RecyclerView recycler = findViewById(R.id.recycler);

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://pouyaheydari.com/vehicles.json", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();
                Vehicle vehicle = gson.fromJson(response.toString(), Vehicle.class);
                TestVehiclesAdapter adapter = new TestVehiclesAdapter(vehicle.getVehicles());
                recycler.setAdapter(adapter);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}