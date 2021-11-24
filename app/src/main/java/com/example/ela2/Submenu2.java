package com.example.ela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Submenu2 extends AppCompatActivity {
    private Button Submenu2_1;
    private Button Submenu2_2;
    private Button Submenu2_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu2);

        Submenu2_1 = findViewById(R.id.button2_1); //Click for the Submenu 1
        Submenu2_2 = findViewById(R.id.button2_2); //Click for the Submenu 2
        Submenu2_3 = findViewById(R.id.button2_3); //Click for the Submenu 3

        //Function for Navigation to Submenu1
        Submenu2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent1 = new Intent(MainActivity.this,Submenu1.class);
                //startActivity(intent1); //intent1 stands for Submenu1
                startActivity(new Intent(Submenu2.this,Submenu2_1.class));
            }
        });

        //Function for Navigation to Submenu3
        Submenu2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(Submenu2.this,Submenu2_2.class));
            }
        });

        //Function for Navigation to Submenu3
        Submenu2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(Submenu2.this,Submenu2_3.class));
            }
        });
    }
}

