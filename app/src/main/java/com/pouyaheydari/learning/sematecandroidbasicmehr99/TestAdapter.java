package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestViewHolder> {

    ArrayList<String> userNames;

    public TestAdapter(ArrayList<String> names) {
        userNames = names;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new TestViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) { //0 - 7
        String name = userNames.get(position);
        holder.txtName.setText(name);
    }

    @Override
    public int getItemCount() {
        return userNames.size();
    }
}
