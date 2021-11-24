package com.example.ela2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Submenu2_2 extends AppCompatActivity {

//    ImageView imageView;
//    boolean isImageFitToScreen;
//    private static final String TAG = "Submenu2_2";

//    private ImageView imageView;
//    private String fullScreenInd;

    //ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu22);

//        imageView = (ImageView) findViewById(R.id.pins_arduino_uno);
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(isImageFitToScreen) {
//                    isImageFitToScreen=false;
//                    imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//                    imageView.setAdjustViewBounds(true);
//                }else{
//                    isImageFitToScreen=true;
//                    imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//                }
//            }
//
//            public void fullscreen() {
//
//                // BEGIN_INCLUDE (get_current_ui_flags)
//                // The UI options currently enabled are represented by a bitfield.
//                // getSystemUiVisibility() gives us that bitfield.
//                int uiOptions = getWindow().getDecorView().getSystemUiVisibility();
//                int newUiOptions = uiOptions;
//                // END_INCLUDE (get_current_ui_flags)
//                // BEGIN_INCLUDE (toggle_ui_flags)
//                boolean isImmersiveModeEnabled =
//                        ((uiOptions | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) == uiOptions);
//                if (isImmersiveModeEnabled) {
//                    Log.i(TAG, "Turning immersive mode mode off.");
//                } else {
//                    Log.i(TAG, "Turning immersive mode mode on.");
//                }
//
//                // Navigation bar hiding:  Backwards compatible to ICS.
//                if (Build.VERSION.SDK_INT >= 14) {
//                    newUiOptions ^= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
//                }
//
//                // Status bar hiding: Backwards compatible to Jellybean
//                if (Build.VERSION.SDK_INT >= 16) {
//                    newUiOptions ^= View.SYSTEM_UI_FLAG_FULLSCREEN;
//                }
//
//                // Immersive mode: Backward compatible to KitKat.
//                // Note that this flag doesn't do anything by itself, it only augments the behavior
//                // of HIDE_NAVIGATION and FLAG_FULLSCREEN.  For the purposes of this sample
//                // all three flags are being toggled together.
//                // Note that there are two immersive mode UI flags, one of which is referred to as "sticky".
//                // Sticky immersive mode differs in that it makes the navigation and status bars
//                // semi-transparent, and the UI flag does not get cleared when the user interacts with
//                // the screen.
//                if (Build.VERSION.SDK_INT >= 18) {
//                    newUiOptions ^= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
//                }
//
//                getWindow().getDecorView().setSystemUiVisibility(newUiOptions);
//                //END_INCLUDE (set_ui_flags)
//            }
//        });

//        Toolbar tb = (Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(tb);
//
//        imageView = findViewById(R.id.pins_arduino_uno);
//        imageView.setImageResource(R.drawable.pins_arduino_uno);
//
//        fullScreenInd = getIntent().getStringExtra("fullScreenIndicator");
//        if ("y".equals(fullScreenInd)) {
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            getSupportActionBar().hide();
//
//            imageView.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
//            imageView.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
//            imageView.setAdjustViewBounds(false);
//            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        }
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(Submenu2_2.this,
//                        Submenu2_2.class);
//
//                if("y".equals(fullScreenInd)){
//                    intent.putExtra("fullScreenIndicator", "");
//                }else{
//                    intent.putExtra("fullScreenIndicator", "y");
//                }
//                Submenu2_2.this.startActivity(intent);
//            }
//        });

//        img=(ImageView) findViewById(R.id.pins_arduino_uno);
//
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Intent intent1 = new Intent(MainActivity.this,Submenu1.class);
//                //startActivity(intent1); //intent1 stands for Submenu1
//                startActivity(new Intent(Submenu2_2.this,pins_arduinouno_picture.class));
//            }
//        });



    }

    public void ImageClick1 (View view){
        Intent browserIntent1=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/101xaqXo1DkEOkN76OFPYm2p-0rRT074q/view?usp=sharing"));
        startActivity(browserIntent1);
    }

    public void ButtonClick1 (View view){
        Intent browserIntent2=new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11bpiXXO8nNrNwvbqdIb6G2SZPhq6q0os/view?usp=sharing"));
        startActivity(browserIntent2);
    }




}