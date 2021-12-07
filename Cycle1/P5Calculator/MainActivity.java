package com.example.sjcet.p5calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button add;
    Button sub,mul,div,equal;
   EditText ans;

    double res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);

        ans = findViewById(R.id.answer);
    }

    public void add(View view) {
        double a = Double.parseDouble(e1.getText().toString());
        double b = Double.parseDouble(e2.getText().toString());
        res = a - b;
    }

    public void Eql(View view) {
        String ans1 = String.valueOf(res);
        ans.setText(ans1);
        res= 0;
    }

    public void sum(View view) {
        double a = Double.parseDouble(e1.getText().toString());
        double b = Double.parseDouble(e2.getText().toString());
        res = a + b;
    }

    public void mult(View view) {
        double a = Double.parseDouble(e1.getText().toString());
        double b = Double.parseDouble(e2.getText().toString());
        res = a * b;
    }

    public void divi(View view) {
        double a = Double.parseDouble(e1.getText().toString());
        double b = Double.parseDouble(e2.getText().toString());
        res = a / b;
    }
}
