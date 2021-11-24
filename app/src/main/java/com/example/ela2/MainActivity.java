package com.example.ela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class MainActivity extends AppCompatActivity {
    private Button Submenu1;
    private Button Submenu2;
    private Button Submenu3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submenu1 = findViewById(R.id.Submenu1); //Click for the Submenu 1
        Submenu2 = findViewById(R.id.Submenu2); //Click for the Submenu 2
        Submenu3 = findViewById(R.id.Submenu3); //Click for the Submenu 3

        //Function for Navigation to Submenu1
        Submenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent1 = new Intent(MainActivity.this,Submenu1.class);
                //startActivity(intent1); //intent1 stands for Submenu1
                startActivity(new Intent(MainActivity.this,Submenu1.class));
            }
        });

        //Function for Navigation to Submenu3
        Submenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(MainActivity.this,Submenu2.class));
            }
        });

        //Function for Navigation to Submenu3
        Submenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(MainActivity.this,Submenu3.class));
            }
        });
    }
}




