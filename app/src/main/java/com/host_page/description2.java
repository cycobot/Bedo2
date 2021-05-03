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

public class description2 extends AppCompatActivity {
    private Button btnminus3;
    private Button btnminus4;
    private Button btnplus3;
    private Button btnplus4;
    private EditText bededtxt2;
    private EditText oxyedtxt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description2);
        bededtxt2 = (EditText)findViewById(R.id.EditText2);
        btnminus3 = (Button)findViewById(R.id.button23);
        btnplus3 = (Button)findViewById(R.id.button);
        btnminus4 = (Button)findViewById(R.id.button27);
        btnplus4 = (Button)findViewById(R.id.button6);
        oxyedtxt2 = (EditText) findViewById(R.id.editText3);
        btnminus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(bededtxt2.getText().toString())-1;
                bededtxt2.setText(String.valueOf(number1));
            }
        });
        btnplus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(bededtxt2.getText().toString())+1;
                bededtxt2.setText(String.valueOf(number1));
            }
        });
        btnminus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(oxyedtxt2.getText().toString())-1;
                oxyedtxt2.setText(String.valueOf(number1));
            }
        });
        btnplus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(oxyedtxt2.getText().toString())+1;
                oxyedtxt2.setText(String.valueOf(number1));
            }
        });
    }
}
