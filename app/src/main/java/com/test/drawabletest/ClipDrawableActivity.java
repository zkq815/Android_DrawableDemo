package com.test.drawabletest;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import static com.test.drawabletest.R.id.iv;

public class ClipDrawableActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_drawable);
        imageView = (ImageView) findViewById(iv);
        ClipDrawable drawable = (ClipDrawable) imageView.getDrawable();
        drawable.setLevel(5000);
    }
}
