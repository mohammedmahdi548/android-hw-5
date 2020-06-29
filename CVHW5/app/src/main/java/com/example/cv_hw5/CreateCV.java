package com.example.cv_hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateCV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_c_v);
        Button ba = findViewById(R.id.Back);
        Button ne = findViewById(R.id.Next);
        final EditText na = findViewById(R.id.EN);
        final EditText ag = findViewById(R.id.EA);
        final EditText jo = findViewById(R.id.EJ);
        final EditText em = findViewById(R.id.EE);
        final EditText ph = findViewById(R.id.EP);

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(CreateCV.this,MainActivity.class);
                startActivity(bk);

            }
        });

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateCV.this,YourCV.class);
                String name = na.getText().toString();
                i.putExtra("YourName",name);
                String age = ag.getText().toString();
                i.putExtra("YourAge",age);
                String job = jo.getText().toString();
                i.putExtra("YourJob",job);
                String email = em.getText().toString();
                i.putExtra("YourEmail",email);
                String phone = ph.getText().toString();
                i.putExtra("YourPhone",phone);
                startActivity(i);





            }
        });
    }
}