package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View view){
        Fragment1 fragment1 = new Fragment1();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.container, fragment1);
        fr.commit();
    }
    public void onClick2(View view){
        Fragment2 fragment2 = new Fragment2();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.container, fragment2);
        fr.commit();
    }
    public void onClick3(View view){
        Fragment3 fragment3 = new Fragment3();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.container, fragment3);
        fr.commit();
    }
}