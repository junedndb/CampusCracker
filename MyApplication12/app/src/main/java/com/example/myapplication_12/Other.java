package com.example.myapplication_12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Other extends AppCompatActivity {
    ListView listView;
    String[] listItemView = {"indiabix.com","examveda.com","testpot.com","freeOnlineTest.in","sawaal.com","wifistudy.com","ssconlineexam.com","exam2win.com"};
    ArrayList<String>toolList;
    ArrayAdapter<String>toolAdapter;
  @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        getSupportActionBar().setTitle("Other");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.buttonclicksoundeffect);

        listView=(ListView)findViewById(R.id.list);

        toolAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItemView);
        listView.setAdapter(toolAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.indiabix.com/"));
                    startActivity(intent);
                }
                else if (i == 1) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.examveda.com/"));
                    startActivity(intent);
                }
                else if (i == 2) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.testpot.com/"));
                    startActivity(intent);
                }
                else if (i == 3) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.freeOnlineTest.in/"));
                    startActivity(intent);
                }
                else if (i == 4) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.sawaal.com/"));
                    startActivity(intent);
                }
                else if (i == 5) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.wifistudy.com/"));
                    startActivity(intent);
                }
                else if (i == 6) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.ssconlineexam.com/"));
                    startActivity(intent);
                }
                else if (i == 7) {
                    mp.start();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.exam2win.com/"));
                    startActivity(intent);
                }
            }
        });

    }
}
