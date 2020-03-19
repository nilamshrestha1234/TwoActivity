package com.example.intentmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText replyMessage;
    private TextView viewMessage;
    String message = "";
    private final String  KEY_I= "nilam";
    private final String  KEY_II = "shrestha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        replyMessage = findViewById(R.id.replyMessage);
        viewMessage = findViewById(R.id.viewMessage);
        Intent intent = getIntent();
        String  msg = intent.getStringExtra(MainActivity.KEY_I);
        viewMessage.setText(msg);
    }


    public void replyMessage(View view){
        String reply = replyMessage.getText().toString();

        // Create a new intent for the reply, add the reply message to it
        // as an extra, set the intent result, and close the activity.
        Intent replyIntent = new Intent();
        replyIntent.putExtra(KEY_II, reply);
        setResult(RESULT_OK, replyIntent);
        finish();

    }
}
