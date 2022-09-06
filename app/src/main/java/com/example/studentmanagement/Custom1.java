package com.example.studentmanagement;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Custom1 extends ArrayAdapter {
    Activity c;
    String S[];
    Integer img[];
    public Custom1(@NonNull Context context, String[] resource, Integer[] textViewResourceId) {
        super(context, R.layout.activity_coarse,resource);
        c= (Activity) context;
        S = resource;
        img=  textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater LF = c.getLayoutInflater();
        convertView = LF.inflate(R.layout.simple,null);
        ImageView im1 = convertView.findViewById(R.id.image4);
        TextView tv1 = convertView.findViewById(R.id.text4);
        im1.setImageResource(img[position]);
        tv1.setText(S[position]);
        return convertView;
    }
}
