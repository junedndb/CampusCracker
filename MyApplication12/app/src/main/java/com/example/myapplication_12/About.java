package com.example.myapplication_12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity {
    Animation animation;
CircleImageView circleImageView;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        circleImageView = (CircleImageView) findViewById(R.id.img_profile);


        animation= AnimationUtils.loadAnimation(getApplicationContext(), R.animator.animation);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.buttonclicksoundeffect);
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();

                circleImageView.setVisibility(view.VISIBLE);
                circleImageView.startAnimation(animation);

                Intent intent = new Intent(getApplicationContext(), Profile.class);
                startActivity(intent);
            }
        });
    }
}
