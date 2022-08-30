package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.finalproject.baseAdapter.CROWNADAPTER;
import com.example.finalproject.baseAdapter.qasimbanquetAdapter;

public class crownbaquet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crownbaquet);

        GridView gridview = (GridView) findViewById(R.id.gridview1);
        gridview.setAdapter(new CROWNADAPTER(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), crownbaquet.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
    }
