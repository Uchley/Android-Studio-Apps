
package com.example.app5;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class SecondActivity extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        String user = "";
        String gift = "How are you?";

        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");

        TextView infoTextView = findViewById(R.id.textView);
        infoTextView.setText((user + ", send " + gift));
    }
}