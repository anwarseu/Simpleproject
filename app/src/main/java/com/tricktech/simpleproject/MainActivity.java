package com.tricktech.simpleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView txt_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_username = (TextView) findViewById(R.id.txt_username);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        txt_username.setText("Hey "+username+" !");

    }
}
