package com.example.sjcet.arraymonthlistview;

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

    TextView tv;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String msg=getIntent().getStringExtra("mykey");// receiving the data
        tv.setText("Welcome"+msg);
        lv=(ListView)findViewById(R.id.listview);

        lv.setOnItemClickListener(this);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);    //connecting menu

        return true;                    // changing to true
    }

//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.emergency:   // full colon
//                Toast.makeText(this," Emergency clicked",Toast.LENGTH_SHORT).show();
//                // using implicit intent
//                Intent callintent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234236"));
//                startActivity(callintent);
//                break;
//            case R.id.profile:
//                Toast.makeText(this," Profile clicked",Toast.LENGTH_SHORT).show();
//                Intent profileintent = new Intent(this,profileActivity.class);
//                startActivity(profileintent);
//                break;
//            case R.id.aboutus:
//                Toast.makeText(this," About us clicked",Toast.LENGTH_SHORT).show();
//                Intent aboutintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
//                startActivity(aboutintent);
//                break;
//            case R.id.signout:
//                Toast.makeText(this," Signout clicked",Toast.LENGTH_SHORT).show();
//                finish();
//                break;
//
//
//        }
//        return true;// changing to true
//    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

        String itemname=lv.getItemAtPosition(i).toString();
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();

    }


}
