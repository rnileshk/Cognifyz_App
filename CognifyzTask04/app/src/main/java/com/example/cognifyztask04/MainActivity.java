package com.example.cognifyztask04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homeLayoutButton(View view){
        setContentView(R.layout.activity_main2);
    }

    public void secondLayoutButton(View view){
        setContentView(R.layout.activity_main);
    }
}