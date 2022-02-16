package com.example.sjcet.oneactivitytonextusingintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.ed1);
        b = findViewById(R.id.btn);
    }

    public void click(View view) {

        String str = e.getText().toString();
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("message_key", str);
        startActivity(intent);


    }
}
