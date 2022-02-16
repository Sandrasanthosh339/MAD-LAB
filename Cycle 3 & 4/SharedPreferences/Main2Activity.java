package com.example.sjcet.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.content.SharedPreferences;


public class Main2Activity extends AppCompatActivity {

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.name);
        t2 = findViewById((R.id.pwd));


        Intent intent = getIntent();
        SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);
        String s = mypref.getString("name",null);
        String s1 = mypref.getString("pwd",null);



        t1.setText(s);
        t2.setText(s1);
    }
}
