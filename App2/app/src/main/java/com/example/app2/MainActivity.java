package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mInfTextView;
    private TextView mInfTextView2;
    private TextView mPhraseTextView;
    private Button mElephantCounterButton;
    private Button mCloudsCounterButton;
    private Button mPhraseButton;
    private int mCount=0;
    private int mCount2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfTextView=findViewById(R.id.TextView);
        mInfTextView2=findViewById(R.id.TextView2);
        mPhraseTextView=findViewById(R.id.TextView3);
        mPhraseButton=findViewById(R.id.button3);
        mElephantCounterButton=findViewById(R.id.button);
        mCloudsCounterButton=findViewById(R.id.button2);

        mElephantCounterButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {

                mInfTextView.setText("I can see " + ++mCount + " Elephants");
        }
    });

        mCloudsCounterButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {

                mInfTextView2.setText("I can see " + ++mCount2 + " Clouds");
            }
        });

        mPhraseButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {

                mPhraseTextView.setText("This is your phrase!");
            }
        });



    }
}






