package com.example.sjcet.oneactivitytonextusingintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
 TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t = findViewById(R.id.tv);

        Intent intent = getIntent();
        String str = ((Intent) intent).getStringExtra("message_key");
        t.setText(str);

    }
}
