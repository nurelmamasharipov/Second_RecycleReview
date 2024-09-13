package com.example.second_recyclereview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarMarksAdapter extends RecyclerView.Adapter<MarksViewHolder>{
    public ArrayList<Marks> marks;
    private OnItemClick onItemClick;

    public CarMarksAdapter(ArrayList<Marks> marks, OnItemClick onItemClick) {
        this.marks = marks;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public MarksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mark, parent, false);
        return new MarksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MarksViewHolder holder, int position) {
        holder.bind(marks.get(position));
        holder.itemView.setOnClickListener(view -> {
            onItemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return marks.size();
    }
}
