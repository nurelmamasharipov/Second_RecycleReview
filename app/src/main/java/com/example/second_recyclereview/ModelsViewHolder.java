package com.example.second_recyclereview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ModelsViewHolder extends RecyclerView.ViewHolder{
    private ImageView imageModel;
    private TextView name;
    private TextView weight;
    private TextView consumption;
    private TextView price;


    public ModelsViewHolder(@NonNull View itemView) {
        super(itemView);
        imageModel = itemView.findViewById(R.id.img_model);
        name = itemView.findViewById(R.id.tv_name);
        weight = itemView.findViewById(R.id.tv_weight);
        consumption = itemView.findViewById(R.id.tv_consumption);
        price = itemView.findViewById(R.id.tv_price);
    }

    protected void bind (Models contacts) {
        name.setText(contacts.getName());
        weight.setText(contacts.getWeight());
        consumption.setText(contacts.getConsumption());
        price.setText(contacts.getPrice());
        Glide.with(itemView.getContext())
                .load(contacts.getImage())
                .into(imageModel);
    }
}
