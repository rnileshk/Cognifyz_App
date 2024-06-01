package com.example.cognifyztask02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] lists ={"C++ Programming", "C Programming", "Python Programming", "JavaScript", "PHP", "Ruby", "Swift", "Java Programming", "DSA", "Kortline", "Internship", "Internview", "Job", "Full Stack Development", "Frunt-End Development", "Back-End Development", "Software Development", "Software Testing",};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                lists
        );

        listView.setAdapter(adapter);

    }
}