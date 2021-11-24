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
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
    public class Submenu3_1 extends AppCompatActivity{
    //private static final int RECOVERY_REQUEST = 1;
    //private YouTubePlayerView youTubeView1;
    private Button comment_1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu31);
        //YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view1);
        //getLifecycle().addObserver(youTubePlayerView1);

        comment_1 = findViewById(R.id.button_comment_1); //Click for the button 3.1 (Examples of ARDUINO UNO)

        comment_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent3 = new Intent(MainActivity.this,Submenu3.class);
                //startActivity(intent3); //intent3 stands for Submenu3
                //OR
                startActivity(new Intent(Submenu3_1.this,Comment_1.class));
            }
        });

    }

}

