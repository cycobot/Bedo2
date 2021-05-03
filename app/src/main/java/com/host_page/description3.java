package com.host_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.Host_page.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class description3 extends AppCompatActivity {
    private Button btnminus5;
    private Button btnminus6;
    private Button btnplus5;
    private Button btnplus6;
    private EditText bededtxt3;
    private EditText oxyedtxt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description3);
        bededtxt3 = (EditText)findViewById(R.id.EditText5);
        btnminus5 = (Button)findViewById(R.id.button33);
        btnplus5 = (Button)findViewById(R.id.button50);
        btnminus6 = (Button)findViewById(R.id.button37);
        btnplus6 = (Button)findViewById(R.id.button60);
        oxyedtxt3 = (EditText) findViewById(R.id.editText5);
        btnminus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(bededtxt3.getText().toString())-1;
                bededtxt3.setText(String.valueOf(number1));
            }
        });
        btnplus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(bededtxt3.getText().toString())+1;
                bededtxt3.setText(String.valueOf(number1));
            }
        });
        btnminus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(oxyedtxt3.getText().toString())-1;
                oxyedtxt3.setText(String.valueOf(number1));
            }
        });
        btnplus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(oxyedtxt3.getText().toString())+1;
                oxyedtxt3.setText(String.valueOf(number1));
            }
        });
    }
}


