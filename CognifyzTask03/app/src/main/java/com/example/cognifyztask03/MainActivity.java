package com.example.cognifyztask03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String courseList[] = {"C++ Programming", "C Programming", "Java Programming", "Python Programming", "Frunt-end Development", "Back-end Development", "Full Stack Development", "Android App Development"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.customlistView);

        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), courseList);
        listView.setAdapter(customBaseAdapter);
    }
}