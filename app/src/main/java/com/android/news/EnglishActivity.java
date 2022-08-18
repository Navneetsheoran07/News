package com.android.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EnglishActivity extends AppCompatActivity {

    ImageButton btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


        btn11 = (ImageButton) findViewById(R.id.btn11);
        btn12 = (ImageButton) findViewById(R.id.btn12);
        btn13 = (ImageButton) findViewById(R.id.btn13);
        btn14 = (ImageButton) findViewById(R.id.btn14);
        btn15 = (ImageButton) findViewById(R.id.btn15);
        btn16 = (ImageButton) findViewById(R.id.btn16);
        btn17 = (ImageButton) findViewById(R.id.btn17);
        btn18 = (ImageButton) findViewById(R.id.btn18);


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", "https://news.abplive.com/");
                startActivity(webviewIntent);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", "https://english.jagran.com/");
                startActivity(webviewIntent);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", " https://www.ndtv.com/");
                startActivity(webviewIntent);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", "https://www.indiatvnews.com/");
                startActivity(webviewIntent);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", " https://news24online.com/");
                startActivity(webviewIntent);
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", "https://zeenews.india.com/");
                startActivity(webviewIntent);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", " https://www.indiatoday.in/");
                startActivity(webviewIntent);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(EnglishActivity.this, LoadActivity.class);
                webviewIntent.putExtra("URL", "https://www.hindustantimes.com/");
                startActivity(webviewIntent);
            }
        });

    }


    }
