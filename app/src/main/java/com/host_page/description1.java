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

public class description1 extends AppCompatActivity {
    private Button btnminus1;
    private Button btnminus2;
    private Button btnplus1;
    private Button btnplus2;
    private EditText bededtxt1;
    private EditText oxyedtxt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description1);
        bededtxt1 = (EditText)findViewById(R.id.EditText1);
        btnminus1 = (Button)findViewById(R.id.button3);
        btnplus1 = (Button)findViewById(R.id.button);
        btnminus2 = (Button)findViewById(R.id.button7);
        btnplus2 = (Button)findViewById(R.id.button6);
        oxyedtxt1 = (EditText) findViewById(R.id.editText);

        btnminus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(bededtxt1.getText().toString())-1;
                bededtxt1.setText(String.valueOf(number1));
            }
        });
        btnplus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(bededtxt1.getText().toString())+1;
                bededtxt1.setText(String.valueOf(number1));
            }
        });
        btnminus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(oxyedtxt1.getText().toString())-1;
                oxyedtxt1.setText(String.valueOf(number1));
            }
        });
        btnplus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(oxyedtxt1.getText().toString())+1;
                oxyedtxt1.setText(String.valueOf(number1));
            }
        });
    }
}