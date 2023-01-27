package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        EditText userEditText = findViewById(R.id.Name);
        EditText giftEditText = findViewById(R.id.Desc);

        Intent intent = new Intent (MainActivity.this, SecondActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());

        startActivity(intent);

    }
}