package com.example.topacademy;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonToast);
        button.setOnClickListener(view -> {
            Toast toast = Toast.makeText(this, "123", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.END, 0, 0);
            toast.show();
        });
    }
}