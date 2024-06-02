package com.example.topacademy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText1;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonToast);
        editText1 = findViewById(R.id.edit_1);
        editText2 = findViewById(R.id.edit_2);
        editText3 = findViewById(R.id.edit_3);

        ArrayList<String> strings = new ArrayList<>();
        strings.add(0,"Жора");
        strings.add(1,"Сергей");
        strings.add(2,"Денис");
        strings.add(3,"Вова");
        strings.add(4,"Андрей");
        Log.d("SergeyTag", strings.toString());

        button.setOnClickListener(view -> {
                Intent intent = new Intent(this, MainActivityTwo.class);
                intent.putStringArrayListExtra("edit1", strings);
                intent.putExtra("edit2", editText2.getText().toString());
                intent.putExtra("edit3", editText3.getText().toString());
                startActivity(intent);
        });
    }
}