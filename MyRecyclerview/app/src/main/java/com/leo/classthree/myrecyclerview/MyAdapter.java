package com.leo.classthree.myrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {

    ArrayList<UserModel> list;
    Context mContext;

    public MyAdapter(ArrayList<UserModel> list, Context context) {
        this.list = list;
        mContext = context;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, final int position) {
        String name = list.get(position).getUsername();
        holder.username_tv.setText(name);

        String imgaeUrl = list.get(position).getUser_proImage();

        Glide
                .with(mContext)
                .load(imgaeUrl)
                .centerCrop()
                .into(holder.profile_image);

        String bodyImageUrl = list.get(position).getUser_body_image();
        Glide
                .with(mContext)
                .load(bodyImageUrl)
                .centerCrop()
                .into(holder.body_image);


        holder.like_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Sobuj clicked button number : "+String.valueOf(position+1), Toast.LENGTH_SHORT).show();
                //intent pass
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewholder extends RecyclerView.ViewHolder {
        ImageView profile_image, body_image;
        TextView username_tv;
        Button like_btn;



        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            profile_image =itemView.findViewById(R.id.user_pro_imageview);
            username_tv = itemView.findViewById(R.id.username_textview);
            body_image = itemView.findViewById(R.id.body_imageview);
            like_btn = itemView.findViewById(R.id.button);

        }

    }
}
