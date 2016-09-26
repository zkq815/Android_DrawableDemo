package com.test.drawabletest;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TransitionDrawableActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2;
    private ImageView imageView;
    private TransitionDrawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_drawable);
        imageView = (ImageView) findViewById(R.id.iv);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        drawable = (TransitionDrawable) imageView.getDrawable();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                drawable.startTransition(2000);
                break;
            case R.id.btn2:
                drawable.reverseTransition(2000);
                break;
            default:
                break;
        }
    }
}
