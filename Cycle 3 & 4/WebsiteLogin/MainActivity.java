package com.example.sjcet.websitelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.btn);
    }

    public void click(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/"));
        startActivity(intent);
    }
}
