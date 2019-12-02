package com.android.navigationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class contact extends AppCompatActivity {

    private EditText etTo;
    private EditText etSubject;
    private EditText etMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        etTo = findViewById(R.id.etext1);
        etSubject = findViewById(R.id.etext2);
        etMessage = findViewById(R.id.etext3);

        Button  button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMail();

            }
        });

    }

    private void sendMail(){

        String email = etTo.getText().toString();
        String subject = etSubject.getText().toString();
        String message = etMessage.getText().toString();

        Intent intent =new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,email);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));

        }

    }

