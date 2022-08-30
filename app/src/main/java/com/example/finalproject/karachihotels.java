package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class karachihotels extends AppCompatActivity {

    CardView candel,hiltop,meadows,parsa1,safron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karachihotels);

        candel = (CardView) findViewById(R.id.cardviewcandel);
        hiltop = (CardView) findViewById(R.id.cardviewhilltop);
        meadows = (CardView) findViewById(R.id.cardviewmeadows);
        parsa1 = (CardView) findViewById(R.id.parsa);
        safron = (CardView) findViewById(R.id.saffron);

        candel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(karachihotels.this,candelbanquet.class);
                startActivity(intent);
            }
        });

        hiltop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(karachihotels.this,hiltopbanquet.class);
                startActivity(intent);
            }
        });

        meadows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(karachihotels.this,meadowsBanquet.class);
                startActivity(intent);
            }
        });

        parsa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(karachihotels.this,parsaBanquet.class);
                startActivity(intent);
            }
        });

        safron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(karachihotels.this,saffronBanquet.class);
                startActivity(intent);
            }
        });







    }
}