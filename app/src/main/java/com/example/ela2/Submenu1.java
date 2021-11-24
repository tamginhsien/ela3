package com.example.ela2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Submenu1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu1);

        // Text view Arduino UNO to add hyperlink
        TextView linkTextView = findViewById(R.id.arduino_uno_textview);
        // method to redirect to provided link
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        // Text view Arduino MEGA to add hyperlink
        TextView linkTextView1 = findViewById(R.id.arduino_mega_textview);
        // method to redirect to provided link
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());

        // Text view Arduino NANO to add hyperlink
        TextView linkTextView2 = findViewById(R.id.arduino_nano_textview);
        // method to redirect to provided link
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        // Text view Arduino LEONARDO to add hyperlink
        TextView linkTextView3 = findViewById(R.id.arduino_leonardo_textview);
        // method to redirect to provided link
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());

    }

    // Arduino IDE download button
    public void arduinoidelink1 (View view) {
        Intent browserIntent1=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.arduino.cc/en/software"));
        startActivity(browserIntent1);
    }
    // Download video button
    public void arduinoidelink2 (View view) {
        Intent browserIntent2=new Intent (Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NxH5RNbIxBk"));
        startActivity(browserIntent2);
    }
    // HEX file location button
    public void arduinoidelink3 (View view) {
        Intent browserIntent3=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oXjWl8tbyiA"));
        startActivity(browserIntent3);
    }
    // Implement Arduino code video button
    public void arduinoidelink4 (View view) {
        Intent browserIntent4=new Intent (Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent4);
    }
    // Official Download button
    public void proteusofficial (View view) {
        Intent browserIntent5=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.labcenter.com/downloads/"));
        startActivity(browserIntent5);
    }
    // Crack (Alternatives) Download Button
    public void crackproteus1 (View view) {
        Intent browserIntent6=new Intent (Intent.ACTION_VIEW, Uri.parse("https://getintopc.com/?s=proteus"));
        startActivity(browserIntent6);
    }
    // Crack Installation Video Button
    public void crackproteus2 (View view) {
        Intent browserIntent7=new Intent (Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2cw9oQbmlzs"));
        startActivity(browserIntent7);
    }
    // No library found Video Button
    public void nolibrary (View view) {
        Intent browserIntent8=new Intent (Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent8);
    }
    // Arduino Library Download Button
    public void arduinolibrary1 (View view) {
        Intent browserIntent9=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eN78XItzolO85AH83Q5xP44Eao2c-vuQ/view?usp=sharing"));
        startActivity(browserIntent9);
    }
    // Adding Arduino Library Video Button
    public void arduinolibrary2 (View view) {
        Intent browserIntent10=new Intent (Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent10);
    }
    // Official KiCAD Download Button
    public void KiCAD (View view) {
        Intent browserIntent11=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.kicad.org/download/"));
        startActivity(browserIntent11);
    }
    // Official Fritzing Download Button
    public void fritzing1 (View view) {
        Intent browserIntent12=new Intent (Intent.ACTION_VIEW, Uri.parse("https://fritzing.org/download/"));
        startActivity(browserIntent12);
    }
    // Crack Fritzing Download Button
    public void fritzing2 (View view) {
        Intent browserIntent13=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qciDMZit1D2NbIRbiPLO5KiO_qbW5iA_/view?usp=sharing"));
        startActivity(browserIntent13);
    }
    // Virtual Breadboard Download Button
    public void virtualbreadboard (View view) {
        Intent browserIntent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.microsoft.com/en-my/p/virtual-breadboard/9nblggh4tj3w?cid=storebadge&ocid=badge&activetab=pivot:overviewtab"));
        startActivity(browserIntent14);
    }
}