package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstTextView = findViewById(R.id.textView);
        TextView secondTextView = findViewById(R.id.textView2);
        TextView thirdTextView = findViewById(R.id.textView3);
        TextView fourthTextView = findViewById(R.id.textView4);

        ImageView bottomImage = findViewById(R.id.imageView4);
        bottomImage.setOnClickListener(view -> {

            String[] phrases = {"A good mood is like a balloon",
            "Doing nothing is hard", "Don't worry if plan A fails",
            "Don't drink while driving",
            "Every rule has an exception"};

            shuffleArray(phrases);

            firstTextView.setText(phrases[0]);
            secondTextView.setText(phrases[1]);
            thirdTextView.setText(phrases[2]);
            fourthTextView.setText(phrases[3]);

        });

    }

    void shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i>0; i--){
            int index = rnd.nextInt(i+1);
            String a = ar[index];
            ar[index]=ar[i];
            ar[i]=a;
        }
    }


}