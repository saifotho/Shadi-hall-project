package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hyderabadhotels extends AppCompatActivity {

    CardView marvi,moomalhal,qasimbanquet,crownbanquet,Marina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabadhotels);

        marvi=(CardView) findViewById(R.id.cardviewMarvi);
        moomalhal=(CardView) findViewById(R.id.moomalhall);
        qasimbanquet=(CardView) findViewById(R.id.qasimbanquet);
        crownbanquet=(CardView) findViewById(R.id.crown);
        Marina=(CardView)findViewById(R.id.marina);




        marvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hyderabadhotels.this,hyderabaddetailslider.class);
                startActivity(intent);
            }
        });

        moomalhal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hyderabadhotels.this,moomalhall.class);
                startActivity(intent);
            }
        });

        qasimbanquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hyderabadhotels.this,qasimbanquet.class);
                startActivity(intent);
            }
        });


        crownbanquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hyderabadhotels.this,crownbaquet.class);
                startActivity(intent);
            }
        });

        Marina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hyderabadhotels.this,marinaBanquet.class);
                startActivity(intent);
            }
        });

    }
}