package com.example.sjcet.p3_passmsgbtwactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
EditText edt;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edt);
        btn = findViewById(R.id.btn);
    }

    public void pass(View view) {

        String str = edt.getText().toString();
        Intent intent = new Intent(getApplicationContext(), Activity_two.class);
        intent.putExtra("message_key", str);
        startActivity(intent);
    }
}
