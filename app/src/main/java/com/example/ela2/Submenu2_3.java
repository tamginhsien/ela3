package com.example.ela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Submenu2_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu23);
    }

    public void ImageClick1 (View view){
        Intent browserIntent1=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vUVK_BNdXCOZO9N3x_sRN0UisU1eRSjw/view?usp=sharing"));
        startActivity(browserIntent1);
    }

    public void ButtonClick1 (View view){
        Intent browserIntent2=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LT_qRvciq6kgEKGmjnOr3SBQUVYMQLDP/view?usp=sharing"));
        startActivity(browserIntent2);
    }

}