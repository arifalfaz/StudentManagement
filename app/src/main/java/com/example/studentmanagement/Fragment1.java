package com.example.studentmanagement;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class Fragment1 extends Fragment {

    View view;
    Button register,show;
    EditText name1,Password1,phone1;
    String name,password,phone;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_1, container, false);

        name1 = view.findViewById(R.id.username1);
        Password1 = view.findViewById(R.id.password1);
        phone1 = view.findViewById(R.id.phone1);

        register = view.findViewById(R.id.register);
        show = view.findViewById(R.id.showdetetls);

        name = name1.getText().toString();
        password = Password1.getText().toString();
        phone = phone1.getText().toString();

         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 name = name1.getText().toString();
                 password = Password1.getText().toString();
                 phone = phone1.getText().toString();
                 register();
             }
         });

         show.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(getActivity(),fetch.class);
                 startActivity(i);
             }
         });
        return view;


    }

    public void register(){
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        String url ="https://wicked-stamps.000webhostapp.com/info1/register.php";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Toast.makeText(getActivity(), "Register data", Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), " Not Register data", Toast.LENGTH_SHORT).show();

            }
        }){

            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> hashMap= new HashMap<>();
                hashMap.put("u",name);
                hashMap.put("p",password);
                hashMap.put("m",phone);
                return hashMap;
            }
        };
        requestQueue.add(stringRequest);


    }
}