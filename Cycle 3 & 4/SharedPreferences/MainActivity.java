package com.example.sjcet.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.DatePicker;


public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b;
    SharedPreferences sharedPreferences;

    public static final String MyPREFERENCES = "MyPrefs" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.name);
        e2 = findViewById(R.id.pwd);
        b = findViewById(R.id.btn);

        sharedPreferences = getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkDataEntered();

                SharedPreferences MyPrefs = getSharedPreferences("activity_main2.xml",0);
                SharedPreferences.Editor editor=MyPrefs.edit();//only write editor

                editor.putString("name",e1.getText().toString());
                editor.putString("pwd",e2.getText().toString());
                editor.commit();

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("name",e1.getText().toString());
                intent.putExtra("pwd",e2.getText().toString());

                startActivity(intent);


                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();


            }
        });


    }

    private void checkDataEntered() {
    }


//    public void click(View view) {
//
//
//
//    }
}
