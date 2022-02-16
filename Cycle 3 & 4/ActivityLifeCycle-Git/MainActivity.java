package com.example.sjcet.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnCreate Called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","oncreate called");
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onStart called");
    }

    protected void onresume(){
        super.onResume();;
        Toast.makeText(this, "OnResume Called", Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onResume Called");
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onpause Called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onpause Called");
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onReStart called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onReStart Called");
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onStop Called");
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy Called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onDestroy Called");
    }

}
