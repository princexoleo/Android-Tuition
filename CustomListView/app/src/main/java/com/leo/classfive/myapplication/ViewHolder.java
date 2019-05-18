package com.leo.classfive.myapplication;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public  class ViewHolder  {
    TextView nameTV, versionNameTv, apiNameTV;
    ImageView apiImageView;

    public ViewHolder(View view) {

        nameTV =view.findViewById(R.id.version_name_textview);
        versionNameTv =view.findViewById(R.id.version_textview);
        apiNameTV =view.findViewById(R.id.api_textView);
        apiImageView= view.findViewById(R.id.api_imageview);

    }
}
