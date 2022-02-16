package com.example.sjcet.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.num1);
        et2 = (EditText)findViewById(R.id.num2);
        tv1 = (TextView)findViewById(R.id.ans);
    }

    public void add(View view) {

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int sum = num1 + num2;
        tv1.setText(Integer.toString(sum));
    }

    public void sub(View view) {

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int sum = num1 - num2;
        tv1.setText(Integer.toString(sum));
    }


    public void mul(View view) {

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int sum = num1 * num2;
        tv1.setText(Integer.toString(sum));
    }

    public void div(View view) {

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int sum = num1 / num2;
        tv1.setText(Integer.toString(sum));
    }
}
