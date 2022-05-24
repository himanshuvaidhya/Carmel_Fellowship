package com.carmel.fellowship;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SingupAdmin extends AppCompatActivity {
    EditText username,userlastname,userpassword;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_admin);
        username=findViewById(R.id.edit1);
        userlastname=findViewById(R.id.edit2);
        userpassword=findViewById(R.id.edit3);
        button=findViewById(R.id.admin_singup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =username.getText().toString();
                String lastname =userlastname.getText().toString();
                String password =userpassword.getText().toString();
            }
        });

    }
}