package com.example.finalproject.baseAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.finalproject.R;

public class HiltopAdapter extends BaseAdapter {

    private Context mContext;


    public HiltopAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(700, 700));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(2, 2, 2, 2);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    public Integer[] mThumbIds = {
            R.drawable.hilltopentr,
            R.drawable.hilltopseats,
            R.drawable.hilltopseats2,
            R.drawable.hilltopseats3,
            R.drawable.hilltopstage2,
            R.drawable.hilltopstage,


    };
}



