package com.leo.classfive.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<DataModel> dataModelArrayList;

    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.custom_list_view);
        dataModelArrayList = new ArrayList<>();


         DataModel varname = new DataModel("Pie","Android Pie","API: 9","JAN 2018");
         dataModelArrayList.add(varname);

         dataModelArrayList.add(new DataModel("Orieo","Android Orieo","API: 8","2017"));
         dataModelArrayList.add(new DataModel("Nugat","Android Nugat","API: 7","2016"));
         dataModelArrayList.add(new DataModel("Marshmallow","Android Marshmallow","API: 6","2015"));
         dataModelArrayList.add(new DataModel("Lolipop","Android Lolipop","API: 5","2014"));
         dataModelArrayList.add(new DataModel("kitkat","Android Kitkat","API: 4.4","2013"));
         dataModelArrayList.add(new DataModel("Jellybean","Android Jellybean","API: 4.1","2012"));
         dataModelArrayList.add(new DataModel("Icecream Sandwitch","Android Sandwitch","API: 4.0","2011"));

         adapter = new CustomAdapter(dataModelArrayList, getApplicationContext());

         listView.setAdapter(adapter);



    }
}
