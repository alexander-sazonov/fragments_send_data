package com.example.fragmentsdataex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentStart fragmentStart = new FragmentStart();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.container,fragmentStart,null).commit();
    }
}