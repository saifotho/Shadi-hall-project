package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.finalproject.baseAdapter.baseAdapter;
import com.example.finalproject.baseAdapter.newbaseAdapter;

public class moomalhall extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moomalhall);

        GridView gridview = (GridView) findViewById(R.id.gridview1);
        gridview.setAdapter(new newbaseAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), moomalhall.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}