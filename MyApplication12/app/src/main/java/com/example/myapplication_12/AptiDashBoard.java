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

public class AptiDashBoard extends AppCompatActivity {
/*    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;*/
    Animation animation;
    CardView cardView_code_PDF1, cardView_PDF_2, cardView_Pdf_3, cardView_Pdf_4;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apti_dash_board);
        getSupportActionBar().setTitle("Aptitude");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

 /*       button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);*/

        cardView_code_PDF1 = (CardView) findViewById(R.id.card_view1);
        cardView_PDF_2 = (CardView) findViewById(R.id.card_view2);
        cardView_Pdf_3 = (CardView) findViewById(R.id.card_view3);
        cardView_Pdf_4 = (CardView) findViewById(R.id.card_view4);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.buttonclicksoundeffect);

        animation= AnimationUtils.loadAnimation(getApplicationContext(), R.animator.animation);

        cardView_code_PDF1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_code_PDF1.setVisibility(view.VISIBLE);
                cardView_code_PDF1.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(),AptiPdf1.class);
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
                Intent intent = new Intent(getApplicationContext(),AptiPdf2.class);
                startActivity(intent);
            }
        });
        cardView_Pdf_3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_Pdf_3.setVisibility(view.VISIBLE);
                cardView_Pdf_3.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(),AptiPdf3.class);
                startActivity(intent);
            }
        });
        cardView_Pdf_4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://bit.ly/2YYtEcg"));
                startActivity(intent);
            }
        });
    }
}

