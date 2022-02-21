package com.example.sjcet.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =  findViewById(R.id.t);
        String msg = getIntent().getStringExtra("mykey");
        tv.setText(msg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getGroupId()){
            case R.id.about:
                Toast.makeText(this,"About Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.contact:
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                Toast.makeText(this, "LogOut Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}


