package com.test.drawabletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BitmapDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
        Log.e("zkq","BitmapDrawable======"+findViewById(R.id.activity_bitmap_drawable).getBackground().toString());
    }
}
