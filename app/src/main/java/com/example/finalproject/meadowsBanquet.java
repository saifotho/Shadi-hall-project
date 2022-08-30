package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.finalproject.baseAdapter.HiltopAdapter;
import com.example.finalproject.baseAdapter.meadowsAdapter;

public class meadowsBanquet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meadows_banquet);



        GridView grid = (GridView) findViewById(R.id.gridview7);
        grid.setAdapter(new meadowsAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), meadowsBanquet.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}