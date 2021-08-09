package com.example.comparetwolabels;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity  {

    TextView textview3;
    EditText EditText1, EditText2;
    Button button1 , button2;

    private final int ORANGE = 0xFFFF3300;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1 = (EditText) findViewById(R.id.EditText1);
        EditText2 = (EditText) findViewById(R.id.EditText2);
        textview3 = (TextView) findViewById(R.id.textView3);

        Button button1 = (Button) findViewById(R.id.button1);
        Button  button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2.getId() == R.id.button2);
             EditText2.setText("");
             EditText1.setText("");
            }

        });

    }


    public void onClick(View view) {

        String Et1 = EditText1.getText().toString();
        String Et2 = EditText2.getText().toString();


        if (Et1.isEmpty() || Et2.isEmpty()) {
            textview3.setText("Values null");
            return;
        }

        if (Et1.equals(Et2)) {
            textview3.setText("Correct");
            textview3.setTextColor(Color.GREEN);

        }
        else{
            textview3.setText("Incorrect, please verify the labels" );
            textview3.setTextColor(Color.RED);
        }


    }





}






