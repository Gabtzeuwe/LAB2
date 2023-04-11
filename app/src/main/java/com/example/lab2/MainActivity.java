package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import user.User;

public class MainActivity extends AppCompatActivity {
private EditText mail;
private EditText password;
private Button log_in_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.password_eddittext);
        log_in_button = findViewById(R.id.button);

        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user = new User();
                user.setMail(mail.getText().toString());
                user.setPassword(password.getText().toString());
                Intent intent = new Intent(getApplicationContext(), Profile.class);
                intent.putExtra("mail", user.getMail());
                intent.putExtra("password",user.getPassword());
                startActivity(intent);



            }
        });

    }
}