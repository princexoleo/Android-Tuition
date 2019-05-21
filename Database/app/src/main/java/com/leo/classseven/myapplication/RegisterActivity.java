package com.leo.classseven.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameET, passET, emailET, phoneET;
    Button regButton;
    MyDatabase db =new MyDatabase(getApplicationContext());



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameET = findViewById(R.id.username_et);
        passET = findViewById(R.id.pass_et);
        emailET = findViewById(R.id.email_et);
        phoneET = findViewById(R.id.phone_et);
        regButton = findViewById(R.id.register_button);

        //



        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveToDatabase();
            }
        });
    }

    private void saveToDatabase() {

               String userName=usernameET.getText().toString();
                String email=emailET.getText().toString();
                String pass =passET.getText().toString();
                 String phone=phoneET.getText().toString();
                 //check if any body empty or not

        //now store information into database..




    }
}
