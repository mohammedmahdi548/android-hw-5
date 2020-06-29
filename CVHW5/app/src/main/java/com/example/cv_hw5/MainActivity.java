package com.example.cv_hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button c = findViewById(R.id.Create);
        Button in = findViewById(R.id.Info);

      c.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent up = new Intent(MainActivity.this,CreateCV.class);
              startActivity(up);
          }
      });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Info.class);
                startActivity(in);

            }

        });

    }
}