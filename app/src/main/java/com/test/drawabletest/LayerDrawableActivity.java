package com.test.drawabletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LayerDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_drawable);
//        Log.e("zkkq","LayerDrawable======"+findViewById(R.id.iv).getBackground().toString());
    }
}
