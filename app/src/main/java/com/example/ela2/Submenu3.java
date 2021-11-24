package com.example.ela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Submenu3 extends AppCompatActivity {
    private Button button3_1;
    private Button button3_2;
    private Button button3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu3);

        button3_1 = findViewById(R.id.button3_1); //Click for the button 3.1 (Examples of ARDUINO MEGA)
        button3_2 = findViewById(R.id.button3_2); //Click for the button 3.2 (Examples of ARDUINO UNO)
        button3_3 = findViewById(R.id.button3_3); //Click for the button 3.3 (Examples of ARDUINO NANO)

        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(Submenu3.this,Submenu3_1.class));
            }
        });

        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(Submenu3.this,Submenu3_2.class));
            }
        });

        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(Submenu3.this,Submenu3_3.class));
            }
        });

    }
}