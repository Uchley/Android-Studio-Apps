package com.example.appanim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button blinkBTN, rotateBTN, fadeBtn, moveBTN, slideBTN, zoomBTN, stopBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        blinkBTN = findViewById(R.id.button);
        rotateBTN = findViewById(R.id.button2);
        fadeBtn = findViewById(R.id.button3);
        moveBTN = findViewById(R.id.button4);
        slideBTN = findViewById(R.id.button5);
        zoomBTN = findViewById(R.id.button6);
        stopBTN = findViewById(R.id.button7);

        blinkBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
                imageView.startAnimation(animation);
            }
        });

        rotateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                imageView.startAnimation(animation);
            }
        });

        fadeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);
                imageView.startAnimation(animation);
            }
        });

        moveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
                imageView.startAnimation(animation);
            }
        });

        slideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
                imageView.startAnimation(animation);
            }
        });

        zoomBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_animation);
                imageView.startAnimation(animation);
            }
        });

        stopBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                imageView.clearAnimation();
            }
        });

    }
}