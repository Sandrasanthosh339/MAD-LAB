package com.example.sjcet.oneactivitytonextactivitybuttonclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void NewActivity(View view) {
        btn = findViewById(R.id.btn);
      Intent Intent = new Intent(this, Activity_Second.class);
        startActivity(Intent);
    }
}
