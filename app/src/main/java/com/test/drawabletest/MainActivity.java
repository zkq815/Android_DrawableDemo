package com.test.drawabletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnBitmap,btnLayer,btnStateList,btnLevelList,btnTransition,btnClip,btnInsert,btnCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPage();
    }

    private void initPage(){
        btnBitmap = (Button) findViewById(R.id.button2);
        btnLayer = (Button) findViewById(R.id.button5);
        btnStateList = (Button) findViewById(R.id.button6);
        btnLevelList = (Button) findViewById(R.id.button7);
        btnTransition = (Button) findViewById(R.id.button8);
        btnInsert = (Button) findViewById(R.id.button9);
        btnClip = (Button) findViewById(R.id.button);
        btnCircle = (Button) findViewById(R.id.button10);

        btnBitmap.setOnClickListener(this);
        btnLayer.setOnClickListener(this);
        btnStateList.setOnClickListener(this);
        btnLevelList.setOnClickListener(this);
        btnTransition.setOnClickListener(this);
        btnClip.setOnClickListener(this);
        btnInsert.setOnClickListener(this);
        btnCircle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2://btnBitmap
                startActivity(new Intent(MainActivity.this,BitmapDrawableActivity.class));
                break;
            case R.id.button5://btnLayer
                startActivity(new Intent(MainActivity.this,LayerDrawableActivity.class));
                break;
            case R.id.button6://btnStateList
                startActivity(new Intent(MainActivity.this,StateListDrawableActivity.class));
                break;
            case R.id.button7://btnLevelList
                startActivity(new Intent(MainActivity.this,LevelListDrawableActivity.class));
                break;
            case R.id.button8://btnTransition
                startActivity(new Intent(MainActivity.this,TransitionDrawableActivity.class));
                break;
            case R.id.button9://btnInsert
                startActivity(new Intent(MainActivity.this,InsertDrawableActivity.class));
                break;
            case R.id.button://btnClip
                startActivity(new Intent(MainActivity.this,ClipDrawableActivity.class));
                break;
            case R.id.button10://btnCircle
                startActivity(new Intent(MainActivity.this,CircleDrawableActivity.class));
                break;
            default:
                break;
        }
    }
}
