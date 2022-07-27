package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      btn=findViewById(R.id.registration);
      btn1=findViewById(R.id.login);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(MainActivity.this,MainActivity2.class);
              startActivity(i);
          }
      });
      btn1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i2= new Intent(MainActivity.this,MainActivity3.class);
              startActivity(i2);
          }
      });
    }
}