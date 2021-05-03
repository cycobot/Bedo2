package com.example.Host_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.host_page.MainActivity;
import com.host_page.description1;

public class Mainpage extends AppCompatActivity {
    private Button doc;
    private Button cus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        doc = (Button) findViewById(R.id.button11);
        cus = (Button) findViewById(R.id.button9);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mainpage.this, MainActivity.class));
            }
        });
        cus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mainpage.this,client1.class));
            }
        });
    }
}