package com.android.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PunjabiActivity extends AppCompatActivity {

    ImageButton btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabi);

        btn21 = (ImageButton) findViewById(R.id.btn21);
        btn22 = (ImageButton) findViewById(R.id.btn22);
        btn23 = (ImageButton) findViewById(R.id.btn23);
        btn24 = (ImageButton) findViewById(R.id.btn24);
        btn25 = (ImageButton) findViewById(R.id.btn25);
        btn26 = (ImageButton) findViewById(R.id.btn26);
        btn27 = (ImageButton) findViewById(R.id.btn27);
        btn28 = (ImageButton) findViewById(R.id.btn28);


        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://punjabi.abplive.com/");
                startActivity(webviewIntent);
            }
        });


        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.punjabijagran.com/");
                startActivity(webviewIntent);
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","");
                startActivity(webviewIntent);
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.indiatv.in/");
                startActivity(webviewIntent);
            }
        });


        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://hindi.news24online.com/");
                startActivity(webviewIntent);
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://zeenews.india.com/hindi/zeephh");
                startActivity(webviewIntent);
            }
        });

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://punjab.news18.com/");
                startActivity(webviewIntent);
            }
        });

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(PunjabiActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://punjabi.hindustantimes.com/");
                startActivity(webviewIntent);
            }
        });
    }
}