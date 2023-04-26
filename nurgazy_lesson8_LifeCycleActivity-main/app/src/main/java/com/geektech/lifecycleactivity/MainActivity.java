package com.geektech.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("shamal", "onCreate MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamal", "onStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamal", "onResume MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamal", "onStop MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamal", "onPause MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamal", "onDestroy MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamal", "onRestart MainActivity");
    }

    public void onClickOpen(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        String text = ((EditText) findViewById(R.id.edit_text)).getText()
                .toString();
        intent.putExtra("key1", text);
        startActivity(intent);

//        finish();
    }
}