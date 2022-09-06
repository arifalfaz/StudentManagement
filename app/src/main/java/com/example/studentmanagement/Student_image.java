package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Student_image extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_image);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Student_image.this,RegisterPage.class);
                i.putExtra("a",R.drawable.img1);
                startActivity(i);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Student_image.this,RegisterPage.class);
                i.putExtra("a",R.drawable.img2);
                startActivity(i);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Student_image.this,RegisterPage.class);
                i.putExtra("a",R.drawable.img3);
                startActivity(i);

            }
        });


        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Student_image.this,RegisterPage.class);
                i.putExtra("a",R.drawable.img4);
                startActivity(i);

            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Student_image.this,RegisterPage.class);
                i.putExtra("a",R.drawable.img5);
                startActivity(i);

            }
        });







    }
}