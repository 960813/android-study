package com.example.app_3week;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_dream01;
    ImageView imageView_dream02;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);

//        imageView_dream01 = findViewById(R.id.imageViewDream01);
//        imageView_dream02 = findViewById(R.id.imageViewDream02);
    }

    public void changeImageButtonOnClick(View view) {
        if (imageIndex == 0) {
            imageView_dream01.setVisibility(View.INVISIBLE);
            imageView_dream02.setVisibility(View.VISIBLE);
            imageIndex = 1;
        } else {
            imageView_dream01.setVisibility(View.VISIBLE);
            imageView_dream02.setVisibility(View.INVISIBLE);
            imageIndex = 0;
        }
    }
}