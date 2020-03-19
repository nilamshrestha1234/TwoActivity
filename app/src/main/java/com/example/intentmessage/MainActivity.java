package com.example.intentmessage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText typeMessage;
private TextView text_header_reply;

private final int REQUEST_KEY = 1;
public static final  String KEY_I= "nilam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeMessage = findViewById(R.id.typeMessage);
        text_header_reply = findViewById(R.id.tvmsg);


    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        String message = typeMessage.getText().toString();
        intent.putExtra(KEY_I,message);
        startActivity(intent);
        startActivityForResult(intent, REQUEST_KEY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //if(requestCode==REQUEST_KEY){
        //if(requestCode == RESULT_OK){
        String message1 = data.getStringExtra("shrestha");

                text_header_reply.setText(message1);
            }
       //}

    //}
}

