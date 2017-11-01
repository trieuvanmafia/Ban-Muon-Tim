package com.example.admin.test;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginXong extends AppCompatActivity {


    Button Btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_xong);
        Btnback = (Button) findViewById(R.id.button2);
        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen = new Intent(LoginXong.this,MainActivity.class);
                startActivity(chuyen);
            }
        });
    }
}
