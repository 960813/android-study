package com.example.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main", "onStart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main", "onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main", "onDestroy 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main", "onPause 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main", "onResume 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Main", "onRestart 호출됨");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Main", "onCreate 호출됨");

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}