package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.constraintLayout);
        mInfoTextView = findViewById(R.id.TextView);

    }

    public void onRedButtonClick(View view) {

        mInfoTextView.setText("Red");
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));

    }

    public void onOrangeButtonClick(View view) {

        mInfoTextView.setText("Orange");
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.orangeColor));

    }

    public void onYellowButtonClick(View view) {

        mInfoTextView.setText("Yellow");
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));

    }
}