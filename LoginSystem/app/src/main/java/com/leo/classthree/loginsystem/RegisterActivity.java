package com.leo.classthree.loginsystem;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nameET, passET, emailET, phoneET;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameET = findViewById(R.id.username_et);
        emailET = findViewById(R.id.email_et);
        passET = findViewById(R.id.pass_et);
        phoneET = findViewById(R.id.phone_et);
        registerBtn = findViewById(R.id.register_button);

        registerBtn.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {

       if (R.id.register_button == v.getId()){
           saveDataToMemory();
       }

    }

    private void saveDataToMemory() {

        if ( !TextUtils.isEmpty(emailET.getText())
             && !TextUtils.isEmpty(nameET.getText())
              && !TextUtils.isEmpty(passET.getText())
              && !TextUtils.isEmpty(phoneET.getText())){

            SharedPreferences preferences = getSharedPreferences("user_box", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            String name = nameET.getText().toString();
            String email = emailET.getText().toString();
            String pass = passET.getText().toString();
            String phone = phoneET.getText().toString();

           // UserInfo userObj = new UserInfo(name,email,pass,phone);

            editor.putString("username",name);
            editor.putString("userpass",pass);
            editor.putString("useremail",email);
            editor.putString("userphone",phone);
            editor.apply();
            Toast.makeText(this, "Save Done !", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Empty not allowed", Toast.LENGTH_SHORT).show();
        }









    }
}
