package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
private TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        Intent i= getIntent();
        String name= i.getStringExtra("t3");
        String Name=i.getStringExtra("t4");
        t1.setText(name);
        t2.setText(Name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.home:
               Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
               break;
           case R.id.setting:
               Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
               break;
               case R.id.logout:
                   Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
               break;
       }

        return super.onOptionsItemSelected(item);
    }
}