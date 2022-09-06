package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login_page extends AppCompatActivity {

    Button Signup ,Sigin;
    EditText user,pass;
    String S1, S2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getSupportActionBar().hide();


        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        Signup = findViewById(R.id.Signup);
        Sigin = findViewById(R.id.Sigin);

        Sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S1=user.getText().toString();
                S2= pass.getText().toString();
                if(S1.contentEquals("admin")&& S2.contentEquals("1234")){
                   Intent Signin = new Intent(Login_page.this,Coarse.class);
                   startActivity(Signin);
                    Toast.makeText(Login_page.this, "Login", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Login_page.this, " Not Login", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Signup = new Intent(Login_page.this,Sign_Up.class);
                startActivity(Signup);
            }
        });
    }
}