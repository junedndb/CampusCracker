package com.example.myapplication_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestionsInterviewList extends AppCompatActivity {
    ListView listView;
    String[] listItemView = {"Questions Sample-1","Questions Sample-2","Questions Sample-3" ,"Questions Sample-4","Questions Sample-5","Questions Sample-6","Questions Sample-7","Questions Sample-8","Questions Sample-9","Questions Sample-10","Questions Sample-11","Questions Sample-12","Questions Sample-13","Questions Sample-14","Questions Sample-15","Questions Sample-16","Questions Sample-17","Questions Sample-18","Questions Sample-19","Questions Sample-20","Questions Sample-21","Questions Sample-22","Questions Sample-23","Questions Sample-24","Questions Sample-25","Questions Sample-26","Questions Sample-27","Questions Sample-28","Questions Sample-29","Questions Sample-30"};
    ArrayList<String> toolList;
    ArrayAdapter<String> toolAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_interview_list);
        getSupportActionBar().setTitle("InterView Questions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=(ListView)findViewById(R.id.list);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.buttonclicksoundeffect);

        toolAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItemView);
        listView.setAdapter(toolAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que1.class);
                    startActivity(intent);
                }
                else if (i == 1) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que2.class);
                    startActivity(intent);
                }
                else if (i == 2) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que3.class);
                    startActivity(intent);
                }
                else if (i == 3) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que4.class);
                    startActivity(intent);
                }
                else if (i == 4) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que5.class);
                    startActivity(intent);
                }
                else if (i == 5) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que6.class);
                    startActivity(intent);
                }
                else if (i == 6) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que7.class);
                    startActivity(intent);
                }
                else if (i == 7) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que8.class);
                    startActivity(intent);
                }
                else if (i == 8) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que9.class);
                    startActivity(intent);
                }
                else if (i == 9) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que10.class);
                    startActivity(intent);
                }
                else if (i == 10) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que11.class);
                    startActivity(intent);
                }
                else if (i == 11) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que12.class);
                    startActivity(intent);
                }
                else if (i == 12) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que13.class);
                    startActivity(intent);
                }
                else if (i == 13) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que14.class);
                    startActivity(intent);
                }
                else if (i == 14) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que15.class);
                    startActivity(intent);
                }
                else if (i == 15) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que16.class);
                    startActivity(intent);
                }
                else if (i == 16) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que17.class);
                    startActivity(intent);
                }
                else if (i == 17) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que18.class);
                    startActivity(intent);
                }
                else if (i == 18) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que19.class);
                    startActivity(intent);
                }
                else if (i == 19) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que20.class);
                    startActivity(intent);
                }
                else if (i == 20) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que21.class);
                    startActivity(intent);
                }
                else if (i == 21) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que22.class);
                    startActivity(intent);
                }
                else if (i == 22) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que23.class);
                    startActivity(intent);
                }
                else if (i == 23) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que24.class);
                    startActivity(intent);
                }
                else if (i == 24) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que25.class);
                    startActivity(intent);
                }
                else if (i == 25) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que26.class);
                    startActivity(intent);
                }
                else if (i == 26) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que27.class);
                    startActivity(intent);
                }
                else if (i == 27) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que28.class);
                    startActivity(intent);
                }
                else if (i == 28) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que29.class);
                    startActivity(intent);
                }
                else if (i == 29) {
                    mp.start();
                    Intent intent = new Intent(getApplicationContext(), Que30.class);
                    startActivity(intent);
                }
                /*                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();*/
            }
        });

    }

}

