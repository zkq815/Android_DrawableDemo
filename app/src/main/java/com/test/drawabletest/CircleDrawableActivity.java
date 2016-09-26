package com.test.drawabletest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class CircleDrawableActivity extends AppCompatActivity {

    private ImageView imageView,imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_drawable);
        imageView = (ImageView) findViewById(R.id.iv);
        imageView1 = (ImageView) findViewById(R.id.iv1);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.temp);
        imageView.setImageDrawable(new CircleDrawable(bitmap));

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.mipmap.temp);
        imageView1.setImageDrawable(new RoundDrawable(bitmap1));
    }
}
