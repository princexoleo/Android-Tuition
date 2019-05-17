package com.leo.classthree.fragmentation;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {
    private static final String TAG = "FragmentB";
    Button btn_b;


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View frag_view = inflater.inflate(R.layout.fragment_b, container, false);
        btn_b = frag_view.findViewById(R.id.button_b);

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button B clicked  from fragment B", Toast.LENGTH_SHORT).show();
            }
        });
        return frag_view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:FragmentsB ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop:FragmentB");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: FragmentB");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: FragmentB");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach: FragmentB ");
        
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: FragmentsB");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: FragmentB");
    }
}
