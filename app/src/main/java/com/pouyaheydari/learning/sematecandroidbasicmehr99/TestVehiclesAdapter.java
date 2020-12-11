package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pouyaheydari.learning.sematecandroidbasicmehr99.pojo.Vehicle_;

import java.util.List;

public class TestVehiclesAdapter extends RecyclerView.Adapter<TestVehiclesAdapter.TestVehiclesViewHolder> {

    List<Vehicle_> list;

    public TestVehiclesAdapter(List<Vehicle_> vehicles) {
        list = vehicles;
    }

    @NonNull
    @Override
    public TestVehiclesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new TestVehiclesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestVehiclesViewHolder holder, int position) {
        holder.txtName.setText(list.get(position).getType());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TestVehiclesViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;

        public TestVehiclesViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }

}
