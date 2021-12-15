package com.example.myapplication_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private static int splash_time_out=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, MainDashboard.class);
                startActivity(homeIntent);
                finish();
            }
        },splash_time_out);

    }
}
