package com.example.admin.test;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button BtnMain;
    EditText user,password;
    TextView signup,forgotpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        BtnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fakeuser ="admin";
                String fakepassword ="admin";
                if(user.getText().toString().equals(fakeuser) && password.getText().toString().equals(fakepassword)) {
                    Intent chuyen = new Intent(MainActivity.this, LoginXong.class);
                    Toast.makeText(MainActivity.this,"Login thành công",Toast.LENGTH_LONG).show();
                    startActivity(chuyen);
                }
                else
                    Toast.makeText(MainActivity.this,"Xin nhập đúng user and password",Toast.LENGTH_LONG).show();
            }

        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen = new Intent(MainActivity.this, FormDangKi.class);
                startActivity(chuyen);
            }
        });
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen = new Intent(MainActivity.this, QuenMatKhau.class);
                startActivity(chuyen);
            }
        });




            }
    private void anhxa(){
                BtnMain    = (Button)   findViewById(R.id.button);
                user       = (EditText) findViewById(R.id.editText);
                password   = (EditText) findViewById(R.id.editText2);
                signup     = (TextView) findViewById(R.id.textsignup);
                forgotpass = (TextView) findViewById(R.id.textforget);
            }
    }

