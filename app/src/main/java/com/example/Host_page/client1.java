package com.example.Host_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.host_page.MainActivity;
import com.host_page.description1;
import com.host_page.description2;
import com.host_page.description3;

public class client1 extends AppCompatActivity {
    private Button apollo1;
    private Button fortis1;
    private Button seven_hills1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client1);

        apollo1 = (Button) findViewById(R.id.button9);
        apollo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(client1.this, appolo.class));
            }
        });
        fortis1 = (Button) findViewById(R.id.button8);
        fortis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(client1.this, fortis.class));
            }
        });
        seven_hills1 = (Button) findViewById(R.id.button7);
        seven_hills1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(client1.this, seven_hills.class));
            }
        });
    }
}