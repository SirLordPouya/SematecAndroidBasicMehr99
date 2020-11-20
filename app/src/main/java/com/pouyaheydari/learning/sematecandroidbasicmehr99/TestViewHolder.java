package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestViewHolder extends RecyclerView.ViewHolder {

    TextView txtName;

    public TestViewHolder(@NonNull View itemView) {
        super(itemView);

        txtName = itemView.findViewById(R.id.txtName);
    }
}
