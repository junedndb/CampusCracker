package com.example.myapplication_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        getSupportActionBar().setTitle("C Progaraming");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
