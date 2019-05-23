package com.leo.classseven.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameET, passET;
    Button loginBtn, gotoRegBtn;

    MyDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // database= new MyDatabase(this);

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

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ginven_userName = usernameET.getText().toString();
                String ginven_userPassword = passET.getText().toString();

                Cursor res = RegisterActivity.saveIntoDatabase.loginChecker(ginven_userName,ginven_userPassword);

                if (res == null){
                    //not matched..
                    Toast.makeText(MainActivity.this, "Login Failed!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login success!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
