package com.example.sampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        int data = intent.getIntExtra("data", 0);
    }

    public void myClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", "mike");
        setResult(RESULT_OK, intent);
        finish();
    }
}