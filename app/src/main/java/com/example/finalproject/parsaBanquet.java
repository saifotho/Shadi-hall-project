package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.finalproject.baseAdapter.meadowsAdapter;
import com.example.finalproject.baseAdapter.parsaAdapter;

public class parsaBanquet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parsa_banquet);

        GridView gride = (GridView) findViewById(R.id.gridview10);
        gride.setAdapter(new parsaAdapter(this));

        gride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), parsaBanquet.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}

