package com.leo.classseven.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameET, passET, emailET, phoneET;
    Button regButton;
    MyDatabase saveIntoDatabase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        saveIntoDatabase = new MyDatabase(getApplicationContext());

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
        if(saveIntoDatabase.insertData(userName,pass,email,phone)){
            Toast.makeText(this, "Data insert successfull", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Data insert Failed!!", Toast.LENGTH_SHORT).show();
        }





    }
}
