package com.leo.classthree.fragmentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentC fragmentC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: Activity");

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        fragmentC = new FragmentC();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction =fragmentManager.beginTransaction();

        transaction.replace(R.id.container, fragmentA);
        transaction.replace(R.id.container_two, fragmentB);
        transaction.commit();

        if (FragmentA.press == 1)
        {
            Log.i(TAG, "onCreate: Trying to change fragment");
            transaction.replace(R.id.container_two, fragmentC);
            transaction.commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Activity");
    }
}
