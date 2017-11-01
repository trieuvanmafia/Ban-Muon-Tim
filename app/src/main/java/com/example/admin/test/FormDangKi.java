package com.example.admin.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormDangKi extends AppCompatActivity {

    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_dang_ki);
        confirm = (Button) findViewById(R.id.button3);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen = new Intent(FormDangKi.this,MainActivity.class);
                startActivity(chuyen);
            }
        });
    }
}
