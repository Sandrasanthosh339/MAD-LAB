package com.example.sjcet.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    GridView gridview;
    static final String[] gridviewvalue={
            "Facebook","Instagram","YouTube",
            "Facebook","Instagram","YouTube",
            "Facebook","Instagram","YouTube"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = findViewById(R.id.gv);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,gridviewvalue);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        String itemname = gridview.getItemAtPosition(i).toString();
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {

    }
}

