package com.example.ela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Submenu2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu21);

    }

    public void ImageClick1 (View view){
        Intent browserIntent1=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WUd_uFH0ToHs4sUFIgHFi_EHhc6YhN_F/view?usp=sharing"));
        startActivity(browserIntent1);
    }

    public void ButtonClick1 (View view){
        Intent browserIntent2=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qDsMpXOoQfEz8mwOlhnmcXqV4_JIUaGH/view?usp=sharing"));
        startActivity(browserIntent2);
    }

}