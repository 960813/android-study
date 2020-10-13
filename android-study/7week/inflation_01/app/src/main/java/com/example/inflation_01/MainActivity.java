package com.example.inflation_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        LinearLayout.LayoutParams params =
//                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        linearLayout.setLayoutParams(params);
//
//        Button b = new Button(this);
//        linearLayout.addView(b);
//
//        setContentView(linearLayout);


        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        if (button == null) {
            Log.e("ButtonIsNull", "System can not found R.id.button Object");
        } else {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}