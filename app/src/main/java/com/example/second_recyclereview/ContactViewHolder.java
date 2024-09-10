package com.example.second_recyclereview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private ImageView contactImage;
    private TextView about, title;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        contactImage = itemView.findViewById(R.id.img_contact);
        about = itemView.findViewById(R.id.tv_about);
        title = itemView.findViewById(R.id.tv_name);
    }
    protected void bind (Contacts contacts) {
        title.setText(contacts.getName());
        about.setText(contacts.getAbout());
        Glide.with(itemView.getContext())
                .load(contacts.getImage())
                .into(contactImage);
    }
}
