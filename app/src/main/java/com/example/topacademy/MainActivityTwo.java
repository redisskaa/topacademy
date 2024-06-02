package com.example.topacademy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        Intent intent = getIntent();
        ArrayList<String> edit1 = intent.getStringArrayListExtra("edit1");
        String edit2 = intent.getStringExtra("edit2");
        String edit3 = intent.getStringExtra("edit3");
        Log.d("SergeyTag", "edit1: " + edit1 + " edit2: " + edit2 + " edit3: " + edit3);

    }
}