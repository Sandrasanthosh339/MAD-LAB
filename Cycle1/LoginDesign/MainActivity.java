package com.example.sjcet.logindesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2;
EditText et1,et2;
Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
    }

    public void login(View view) {
    }
    
}
