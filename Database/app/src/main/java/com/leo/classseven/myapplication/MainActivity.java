package com.leo.classseven.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usernameET, passET;
    Button loginBtn, gotoRegBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = findViewById(R.id.username_et_id);
        passET = findViewById(R.id.pass_et_id);
        loginBtn = findViewById(R.id.login_btn_id);
        gotoRegBtn = findViewById(R.id.new_acccount_button_id);


        gotoRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goReg = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(goReg);
            }
        });
    }
}
