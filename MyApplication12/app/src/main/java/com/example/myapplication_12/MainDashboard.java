package com.example.myapplication_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.example.myapplication_12.R.*;

public class MainDashboard extends AppCompatActivity {
private Button button1;
private Button button2;
private Button button3;
private Button button4;
private Button button5;
private Button button6;
public FloatingActionButton share_floatingActionButton;


CardView cardView_code, cardView_apti, cardView_Que, cardView_Other, cardView_About, cardView_Share;
Animation animation;
WebView webView;



    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main_dashboard);
  /*      getSupportActionBar().setTitle("C Progaraming");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        /*button1=(Button) findViewById(id.button1);
        button2=(Button) findViewById(id.button2);
        button3=(Button) findViewById(id.button3);
        button4=(Button) findViewById(id.button4);
        button5=(Button) findViewById(id.button5);
        button6=(Button) findViewById(id.button6);*/



        cardView_code = (CardView) findViewById(id.card_view1);
        cardView_apti = (CardView) findViewById(id.card_view2);
        cardView_Que = (CardView) findViewById(id.card_view3);
        cardView_Other = (CardView) findViewById(id.card_view4);
        cardView_About = (CardView) findViewById(id.card_view5);
        cardView_Share = (CardView) findViewById(id.card_view6);


        animation= AnimationUtils.loadAnimation(getApplicationContext(), animator.animation);

        final MediaPlayer mp = MediaPlayer.create(this, raw.buttonclicksoundeffect);
        cardView_code.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_code.setVisibility(view.VISIBLE);
                cardView_code.startAnimation(animation);

                Intent intent = new Intent(getApplicationContext(), CodeDahBoard.class);
                startActivity(intent);
            }
        });
        cardView_apti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_apti.setVisibility(view.VISIBLE);
                cardView_apti.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(), AptiDashBoard.class);
                startActivity(intent);
            }
        });
        cardView_Que.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_Que.setVisibility(view.VISIBLE);
                cardView_Que.startAnimation(animation);

                Intent intent = new Intent(getApplicationContext(), QuestionsInterviewList.class);
                startActivity(intent);
            }
        });
        cardView_Other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_Other.setVisibility(view.VISIBLE);
                cardView_Other.startAnimation(animation);

                Intent intent = new Intent(getApplicationContext(), Other.class);
                startActivity(intent);

/*                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Hi");
                String url="https://ShaikhJuned.com";
                intent.putExtra(Intent.EXTRA_TEXT,url);
                startActivity(Intent.createChooser(intent,"Share Via"));*/
            }
        });
        cardView_About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                cardView_About.setVisibility(view.VISIBLE);
                cardView_About.startAnimation(animation);

                Intent intent = new Intent(getApplicationContext(), About.class);
                startActivity(intent);
            }
        });
        cardView_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

                // Add data to the intent, the receiving app will decide
                // what to do with it.
                share.putExtra(Intent.EXTRA_SUBJECT, "CampusCracker Download");
                String text = "*Hi there,*\n\n*Welcome to CampusCracker...*\n\n*Developed by Juned Shaikh, BE Mechanical, RCPIT, Shirpur.*\n\nYou are about to download CampusCracker Android App.\n\nCampus Cracker is the app specially designed for students to crack Aptitude Test as well as coding interviews. It contains common Aptitude Questions, Interview Questions, Basic Programming Concepts and Code Snippets.\n\n\uD83D\uDE4F\n\n*Download Link:* ";
                share.putExtra(Intent.EXTRA_TEXT, text+"https://bit.ly/2ShuEFZ");

                startActivity(Intent.createChooser(share, "Share link!"));
            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainuresourse,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case id.item1:
                Intent intent1 = new Intent(getApplicationContext(), CodeDahBoard.class);
                startActivity(intent1);
                return true;
            case id.item2:
                Intent intent2 = new Intent(getApplicationContext(), AptiDashBoard.class);
                startActivity(intent2);
                return true;
            case id.item3:
                Intent intent = new Intent(getApplicationContext(), QuestionsInterviewList.class);
                startActivity(intent);
                return true;
            case id.item4:
                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

                // Add data to the intent, the receiving app will decide
                // what to do with it.
                share.putExtra(Intent.EXTRA_SUBJECT, "CampusCracker Download");
                String text = "*Hi there,*\n\n*Welcome to CampusCracker...*\n\n*Developed by Juned Shaikh, BE Mechanical, RCPIT, Shirpur.*\n\nYou are about to download CampusCracker Android App.\n\nCampus Cracker is the app specially designed for students to crack Aptitude Test as well as coding interviews. It contains common Aptitude Questions, Interview Questions, Basic Programming Concepts and Code Snippets.\n\n\uD83D\uDE4F\n\n*Download Link:* ";
                share.putExtra(Intent.EXTRA_TEXT, text+"https://bit.ly/2ShuEFZ");

                startActivity(Intent.createChooser(share, "Share link!"));
                return true;
            case id.item5:
                Intent intent5 = new Intent(getApplicationContext(), About.class);
                startActivity(intent5);
                return true;
            case id.item6:
                Intent intent6 = new Intent(Intent.ACTION_VIEW);
                intent6.setData(Uri.parse("https://www.indiabix.com/"));
                startActivity(intent6);
                return true;
            default:return super.onOptionsItemSelected(item);

        }
    }
    public void onBackPressed(){
        final AlertDialog.Builder builder= new AlertDialog.Builder(MainDashboard.this);
        builder.setMessage("Do you want to close it?");
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                builder.setCancelable(true);
            }
        });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }

    private void startWebView(String url) {

        //Create new webview Client to show progress dialog
        //When opening a url or click on link

        webView.setWebViewClient(new WebViewClient() {
            ProgressDialog progressDialog;

            //If you will not use this method url links are opeen in new brower not in webview
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            //Show loader on url load
            public void onLoadResource (WebView view, String url) {
                if (progressDialog == null) {
                    // in standard case YourActivity.this
                    progressDialog = new ProgressDialog(MainDashboard.this);
                    progressDialog.setMessage("Loading...");
                    progressDialog.show();
                }
            }
            public void onPageFinished(WebView view, String url) {
                try{
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        progressDialog = null;
                    }
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }

        });

        // Javascript inabled on webview
        webView.getSettings().setJavaScriptEnabled(true);

        // Other webview options
	    /*
	    webView.getSettings().setLoadWithOverviewMode(true);
	    webView.getSettings().setUseWideViewPort(true);
	    webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
	    webView.setScrollbarFadingEnabled(false);
	    webView.getSettings().setBuiltInZoomControls(true);
	    */

	    /*
	     String summary = "<html><body>You scored <b>192</b> points.</body></html>";
         webview.loadData(summary, "text/html", null);
	     */

        //Load url in webview
        webView.loadUrl(url);


    }
}
