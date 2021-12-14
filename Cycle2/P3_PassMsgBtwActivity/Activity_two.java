package com.example.sjcet.p3_passmsgbtwactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
public class Activity_two extends AppCompatActivity {
TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        txv = findViewById(R.id.txv);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        txv.setText(str);
    }
}
