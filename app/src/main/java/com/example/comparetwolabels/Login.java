package com.example.comparetwolabels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class Login extends AppCompatActivity {

    EditText et_login;
    Button btn_login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_login = findViewById(R.id.et_login);
        btn_login = findViewById(R.id.btn_login);

        et_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "click me", Toast.LENGTH_SHORT).show();

            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


          //

          RequestQueue queue= Volley.newRequestQueue(Login.this);
               String url ="https://www.metaweather.com/api/location/search/?query=london";
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                       new Response.Listener<String>() {
                           @Override
                           public void onResponse(String response) {
                              // Display the first 500 characters of the response string.
                               Toast.makeText(Login.this, response, Toast.LENGTH_SHORT).show();
                           }
                       }, new Response.ErrorListener() {
                   @Override
                 public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Login.this, "Error", Toast.LENGTH_SHORT).show();
                   }
              });


                queue.add(stringRequest);




            }
        });


    }
}