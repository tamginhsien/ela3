package com.example.ela2;

import android.content.Context;

import androidx.annotation.RawRes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {

    public static final String YOUTUBE_API_KEY = "AIzaSyCZxm6YoUCpJgvLVh8EsGzsEGDpWQeUl3w";

    public String getCodeFromTxt(Context context, int file) {
        InputStream is = context.getResources().openRawResource(file);
        ByteArrayOutputStream bs = new ByteArrayOutputStream();

        int i;
        try {
            i = is.read();
            while (i != -1)
            {
                bs.write(i);
                i = is.read();
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bs.toString();
    }

}
