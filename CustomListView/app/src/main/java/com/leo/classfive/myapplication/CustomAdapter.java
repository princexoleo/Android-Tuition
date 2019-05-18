package com.leo.classfive.myapplication;

import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<DataModel> {

    ArrayList<DataModel> list;
    Context mContext;

    public CustomAdapter(ArrayList<DataModel> list, Context mContext) {
        super(mContext, R.layout.item_list, list);
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater customInflater =  LayoutInflater.from(getContext());
        View custom_view = customInflater.inflate(R.layout.item_list,parent,false);

        ViewHolder viewHolder;
        final View result;


        if (convertView == null)
        {
            convertView = custom_view;
            viewHolder = new ViewHolder(convertView);
            viewHolder.nameTV.setText(list.get(position).getName());
            viewHolder.versionNameTv.setText(list.get(position).getVersionName());
            viewHolder.apiNameTV.setText(list.get(position).getApiName());
            //image view also be set with the help of glide
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder = new ViewHolder(convertView);
        viewHolder.nameTV.setText(list.get(position).getName());
        viewHolder.versionNameTv.setText(list.get(position).getVersionName());
        viewHolder.apiNameTV.setText(list.get(position).getApiName());

        return  convertView;
    }
}
