package com.tricktech.simpleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public Button btn_login;
    public EditText edt_username, edt_password;
    public String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.btn_login);
        edt_username = (EditText) findViewById(R.id.edt_username);
        edt_password = (EditText) findViewById(R.id.edt_password);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = edt_username.getText().toString();
//
//                if (username.isEmpty()){
//                    Toast.makeText(LoginActivity.this, "Please enter username!", Toast.LENGTH_SHORT).show();
//                }else {
//                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                    intent.putExtra("username", username);
//                    startActivity(intent);

                if (username.isEmpty()) {
                    Toast.makeText(LoginActivity.this, " Please enter your name.", Toast.LENGTH_LONG).show();
                } else {

                    Intent ll = new Intent(LoginActivity.this, MainActivity.class);
                    ll.putExtra("username", username);
                    startActivity(ll);
                    finish();
                }
            }

        });

    }


}




