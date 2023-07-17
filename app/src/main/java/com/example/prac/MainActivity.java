package com.example.prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
public static final String Tag = "My name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag, "onCreate: ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"OnDestroy");
    }
}