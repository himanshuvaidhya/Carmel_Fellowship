package com.carmel.fellowship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginAdmin extends AppCompatActivity {
    EditText useremail,userpassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        useremail=findViewById(R.id.login_edit1);
        userpassword=findViewById(R.id.login_edit2);
        button=findViewById(R.id.looin_admin);

    }
}