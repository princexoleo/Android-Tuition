package com.leo.classthree.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter adapter;
    ArrayList<UserModel> datalist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        datalist = new ArrayList<>();

        UserModel user1 = new UserModel("One","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV0I6VDKQ3vmT9y2QFvx7UZ4aTK_HZUbbHyIvmr_sgoa3sIBB6cg",
                "https://png.pngtree.com/thumb_back/fh260/back_pic/00/15/30/4656e81f6dc57c5.jpg");
        user1.setUsername("Leon");

        datalist.add(user1);

        UserModel user2 = new UserModel("Two","https://i.dailymail.co.uk/i/pix/2016/03/22/13/32738A6E00000578-3504412-image-a-6_1458654517341.jpg",
                "https://cdn.vox-cdn.com/thumbor/lY4WWEgk4bl24nLC3B8Iv8xRV08=/0x0:1500x1000/1200x800/filters:focal(630x380:870x620)/cdn.vox-cdn.com/uploads/chorus_image/image/55939133/akrales_160708_1123_A_0039.0.0.jpg");

        datalist.add(user2);

        UserModel user3 = new UserModel("Three","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV0I6VDKQ3vmT9y2QFvx7UZ4aTK_HZUbbHyIvmr_sgoa3sIBB6cg",
                "http://wowslider.com/sliders/demo-81/data1/images/redkite50498.jpg");

        datalist.add(user3);


        UserModel user4 = new UserModel("Four","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV0I6VDKQ3vmT9y2QFvx7UZ4aTK_HZUbbHyIvmr_sgoa3sIBB6cg",
                "https://www.gettyimages.in/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg");

        datalist.add(user4);

        UserModel user5 = new UserModel("Five","https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/09/12/11/naturo-monkey-selfie.jpg?w968h681",
                "https://storage.googleapis.com/material-vignettes.appspot.com/image/3-0.jpg");

        datalist.add(user5);

        adapter = new MyAdapter(datalist,MainActivity.this); //data pass


        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
        //mRecyclerView.setItemAnimator(new DefaultItemAnimator());



    }
}
