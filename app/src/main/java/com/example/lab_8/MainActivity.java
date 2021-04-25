package com.example.lab_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView image;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button)findViewById(R.id.b1);
        image = (ImageView) findViewById(R.id.img);
        txt = (TextView) findViewById(R.id.txt);;
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                button.startAnimation(animation);

                Intent intent = new Intent(MainActivity.this, Canvas.class);
                startActivity(intent);


            }

        });
        Animation animate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.righttoleft);
        txt.startAnimation(animate);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink_anim);
        image.startAnimation(anim);
    }
}