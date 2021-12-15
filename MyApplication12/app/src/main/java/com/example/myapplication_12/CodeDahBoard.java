package com.example.myapplication_12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class CodeDahBoard extends AppCompatActivity {
 /*   private Button button1;
    private Button button2;*/
    Animation animation;
    CardView cardView_code_PDF1, cardView_PDF_2, cardView_Code, cardView_Que;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_dashboard);
        getSupportActionBar().setTitle("Codes Pdf");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

 /*       button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);*/

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.buttonclicksoundeffect);

        animation= AnimationUtils.loadAnimation(getApplicationContext(), R.animator.animation);
        cardView_code_PDF1 = (CardView) findViewById(R.id.card_view1);
        cardView_PDF_2 = (CardView) findViewById(R.id.card_view2);
        cardView_Que = (CardView) findViewById(R.id.card_view3);
        cardView_Code = (CardView) findViewById(R.id.card_view4);

        cardView_code_PDF1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_code_PDF1.setVisibility(view.VISIBLE);
                cardView_code_PDF1.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(), CodePdf1.class);
                startActivity(intent);
            }
        });
        cardView_PDF_2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_PDF_2.setVisibility(view.VISIBLE);
                cardView_PDF_2.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(), CodePdf2.class);
                startActivity(intent);
            }
        });
        cardView_Que.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_Que.setVisibility(view.VISIBLE);
                cardView_Que.startAnimation(animation);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.tutorialspoint.com/cprogramming/cprogramming_interview_questions"));
                startActivity(intent);
            }
        });
        cardView_Code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_Code.setVisibility(view.VISIBLE);
                cardView_Code.startAnimation(animation);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.programiz.com/c-programming/examples"));
                startActivity(intent);
            }
        });
    }
}
