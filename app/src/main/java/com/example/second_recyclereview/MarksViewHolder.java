package com.example.second_recyclereview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class MarksViewHolder extends RecyclerView.ViewHolder {
    private ImageView marksImage;
    private TextView  title;

    public MarksViewHolder(@NonNull View itemView) {
        super(itemView);
        marksImage = itemView.findViewById(R.id.img_contact);
        title = itemView.findViewById(R.id.tv_name);
    }
    protected void bind (Marks contacts) {
        title.setText(contacts.getName());
        Glide.with(itemView.getContext())
                .load(contacts.getImage())
                .into(marksImage);
    }
}


