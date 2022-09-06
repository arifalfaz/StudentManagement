package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fetch extends AppCompatActivity {

    EditText name2,password2,number2;
    Button fetch,update,delete;
    String name3,password3,number3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch);

        name2 =findViewById(R.id.username2);
        password2 = findViewById(R.id.password2);
        number2 = findViewById(R.id.phone2);

        fetch = findViewById(R.id.fetchbtn);
        update = findViewById(R.id.update);
        delete= findViewById(R.id.delete);

        name3 = name2.getText().toString();
        password3 = password2.getText().toString();
        number3 = number2.getText().toString();


        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fetch();
            }
        });



        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                update();
            }
        });



        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                delete();
            }
        });

    }

    public void fetch(){


    }
    public void update(){


    }


    public void delete(){


    }
}