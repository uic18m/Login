package com.example.teachexactly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    int counter =4;
    final String pwd="123456";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.user);
        password=findViewById(R.id.pwd);
        String userName=username.getText().toString();
        login=findViewById(R.id.login);
        getSupportActionBar().hide();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validation(userPassword);
               if (password.getText().toString().equals(pwd)){
                    Intent intent=new Intent(MainActivity.this,Notification.class);
                    intent.putExtra(Notification.USERNAME,userName);
                    startActivity(intent);
                }else {
                    counter--;
                    if (counter==0){
                        login.setEnabled(false);
                        Toast.makeText(getApplicationContext(),"You are blocked from the app",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}