package com.android.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HindiDashboardActivity extends AppCompatActivity {

    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_dashboard);

        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn6 = (ImageButton) findViewById(R.id.btn6);
        btn7 = (ImageButton) findViewById(R.id.btn7);
        btn8 = (ImageButton) findViewById(R.id.btn8);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.abplive.com/");
                startActivity(webviewIntent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.jagran.com/");
                startActivity(webviewIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://khabar.ndtv.com/");
                startActivity(webviewIntent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.indiatv.in/");
                startActivity(webviewIntent);
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://hindi.news24online.com/");
                startActivity(webviewIntent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://zeenews.india.com/hindi");
                startActivity(webviewIntent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://aajtak.intoday.in/indiatoday-hindi/");
                startActivity(webviewIntent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.livehindustan.com/");
                startActivity(webviewIntent);
            }
        });



    }
}