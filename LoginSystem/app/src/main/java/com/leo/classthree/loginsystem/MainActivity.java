package com.leo.classthree.loginsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userNameET, userPassEt;
    Button loginButton, newAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = findViewById(R.id.username_et_id);
        userPassEt = findViewById(R.id.pass_et_id);

        loginButton = findViewById(R.id.login_btn_id);
        newAccountBtn = findViewById(R.id.new_acccount_button_id);


        newAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class) ;
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userNameET.getText().toString();
                String pass = userPassEt.getText().toString();

                SharedPreferences preferences = getSharedPreferences("user_box", MODE_PRIVATE);
               String prefUsername = preferences.getString("username", "");
               String prefPass = preferences.getString("userpass", "");

               if (name.equals(prefUsername)   && pass.equals(prefPass))
               {
                   Toast.makeText(MainActivity.this, "Matched Succesfully", Toast.LENGTH_SHORT).show();
                   //pass to next activity
                   //by intent
               }else{
                   Toast.makeText(MainActivity.this, "Wrong username password", Toast.LENGTH_SHORT).show();
               }

            }
        });

    }
}
