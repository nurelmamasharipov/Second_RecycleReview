package com.example.second_recyclereview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarModelsAdapter extends RecyclerView.Adapter<ModelsViewHolder>{
    private ArrayList<Models> models;
    public CarModelsAdapter(ArrayList<Models> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public ModelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_model, parent, false);
        return new ModelsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelsViewHolder holder, int position) {
        holder.bind(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
