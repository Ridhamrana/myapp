package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText name,contact,password,email;
    private Button sumbit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.name_id);
        contact=findViewById(R.id.contact_id);
        email=findViewById(R.id.email_id);
        password=findViewById(R.id.password_id);


        sumbit=findViewById(R.id.btn);
        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Contact = contact.getText().toString();
                String Email = email.getText().toString();
                String Password = password.getText().toString();



                Intent i =new Intent(MainActivity2.this,MainActivity4.class);
                i.putExtra("t3",Name);

                startActivity(i);
            }
        });
    }
}