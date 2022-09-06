package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegisterPage extends AppCompatActivity {
    ImageView addimg;
    Button addbtn;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        fragmentManager = getSupportFragmentManager();
        addimg = findViewById(R.id.addimg);
        addbtn = findViewById(R.id.add);


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            int student_image = bundle.getInt("a");
            addimg.setImageResource(student_image);
        }


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              fragmentManager.beginTransaction().replace(R.id.frame,new Fragment1()).commit();

            }
        });
    }
}