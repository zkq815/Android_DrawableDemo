package com.test.drawabletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LevelListDrawableActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_list_drawable);
        imageView = (ImageView) findViewById(R.id.iv);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        imageView.setImageLevel(9);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                imageView.setImageLevel(10);
                break;
            case R.id.btn2:
                imageView.setImageLevel(19);
                break;
            default:
                break;
        }
    }
}
