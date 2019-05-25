package com.leo.classthree.fragmentation;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    private static final String TAG = "FragmentA";


    Button btn;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View frag_view = inflater.inflate(R.layout.fragment_a, container, false);


        btn = frag_view.findViewById(R.id.button_a);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment A Button CLiked", Toast.LENGTH_SHORT).show();

            }
        });



        return frag_view;
    }




    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:FragmentsA ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop:FragmentA");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: FragmentA");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: FragmentA");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach:FragmentA ");
        
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: FragmentsA");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: FragmentA");
    }
}
