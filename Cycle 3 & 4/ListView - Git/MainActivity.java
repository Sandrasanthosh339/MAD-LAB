package com.example.sjcet.listview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv1);
        lv = findViewById(R.id.listview);

        String msg = getIntent().getStringExtra("mykey");//rexeiving data
        tv.setText("Welcome!!!"+msg);

        String[] courses = {"MCA","MBA","BCA","BBA"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,courses);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String itemname = lv.getItemAtPosition(i).toString();
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();
    }
}


