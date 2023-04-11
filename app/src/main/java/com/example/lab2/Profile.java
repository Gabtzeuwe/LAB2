package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import user.User;

public class Profile extends AppCompatActivity {
    private TextView mail;
    private TextView password;
    private Button button;
    private User user;

    public void getParam() {
        Bundle extras = getIntent().getExtras();
        try {
user.setMail(extras.getString("mail"));
        user.setPassword(extras.getString("password"));
        } catch (NullPointerException e) {
            Log.e("Profile","getParam: ", e);

        }}
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profile);
user = new User();
getParam();
mail = findViewById(R.id.mail_textView);
password = findViewById(R.id.password_textview);
button=findViewById(R.id.go_back_button);
mail.setText(user.getMail());
password.setText(user.getPassword());

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        finish();
    }
});
        }

}