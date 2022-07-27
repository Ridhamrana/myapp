package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
private EditText email,password,name;
private Button sumbit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        sumbit=findViewById(R.id.btn_id);
        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();

                String Email = email.getText().toString();
                String Password = password.getText().toString();
                Intent t = new Intent(MainActivity3.this,MainActivity4.class);
                t.putExtra("t4",Name);
                startActivity(t);
            }
        });
    }
}