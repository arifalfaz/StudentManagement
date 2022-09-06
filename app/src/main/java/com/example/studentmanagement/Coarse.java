package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Coarse extends AppCompatActivity  {
    ImageView imageView;

        ListView listView;
        String name[]= {"Computer Science Engineering",
                "Bachelor of Medicine and Bachelor of Surgery",
                "Mechanical Engineering",
                "Chemical Engineering","PHD",
                "Bachelor Of Computer Application",
                "Automobile Engineering","Electrical Engineering",
                "Software Engineering Training"};

        Integer image[]= {R.drawable.computer_science,R.drawable.doctery,
                R.drawable.mechanical,R.drawable.chemical,R.drawable.phd,R.drawable.bca
                ,R.drawable.automobile,R.drawable.electrical,R.drawable.softwer};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coarse);
        getSupportActionBar().hide();

        listView = findViewById(R.id.listview);
        Custom1 cs = new Custom1(Coarse.this,name,image);
        listView.setAdapter(cs);

        // onclick listner on listview

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    Toast.makeText(Coarse.this, "1 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);

                }

                if(i==1){
                    Toast.makeText(Coarse.this, "2 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==2){
                    Toast.makeText(Coarse.this, "3 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==3){
                    Toast.makeText(Coarse.this, "4 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==4){
                    Toast.makeText(Coarse.this, "5 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==5){
                    Toast.makeText(Coarse.this, "6 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==6){
                    Toast.makeText(Coarse.this, "7 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==7){
                    Toast.makeText(Coarse.this, "8 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }

                if(i==8){
                    Toast.makeText(Coarse.this, "9 clicked", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(Coarse.this,Student_image.class);
                    startActivity(i1);
                }
            }
        });

        //end onClicked listner


        imageView = findViewById(R.id.imageview);
        imageView.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable)imageView.getBackground()).start();
            }
        });
    }

}