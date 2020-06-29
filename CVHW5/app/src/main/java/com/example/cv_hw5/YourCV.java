package com.example.cv_hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class YourCV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_c_v);
       TextView yourcv = findViewById(R.id.center);
        TextView name = findViewById(R.id.n1);
        TextView shown = findViewById(R.id.EN);
        TextView age = findViewById(R.id.a1);
        TextView showa = findViewById(R.id.EA);
        TextView job = findViewById(R.id.j1);
        TextView showj = findViewById(R.id.EJ);
        TextView email = findViewById(R.id.e1);
        TextView showe = findViewById(R.id.EE);
        TextView phone = findViewById(R.id.p1);
        TextView showp = findViewById(R.id.EP);

        String nme = getIntent().getStringExtra("YourName");
        shown.setText(nme);

        String ae = getIntent().getStringExtra("YourAge");
        showa.setText(ae);

        String jb = getIntent().getStringExtra("YourJob");
        showj.setText(jb);

        String emil = getIntent().getStringExtra("YourEmail");
        showe.setText(emil);

        String phne = getIntent().getStringExtra("YourPhone");
        showp.setText(phne);




    }
}