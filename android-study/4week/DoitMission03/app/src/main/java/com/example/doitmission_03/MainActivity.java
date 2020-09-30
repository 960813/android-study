package com.example.doitmission_03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewTop;
    ImageView imageViewBottom;

    BitmapDrawable bitmapDrawable;

    int bitmapWidth;
    int bitmapHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewTop = findViewById(R.id.img_view_top);
        imageViewBottom = findViewById(R.id.img_view_bottom);

        bitmapDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.photo);

        bitmapWidth = bitmapDrawable.getIntrinsicWidth();
        bitmapHeight = bitmapDrawable.getIntrinsicHeight();

        imageViewTop.setImageDrawable(bitmapDrawable);
        imageViewTop.getLayoutParams().width = bitmapWidth;
        imageViewTop.getLayoutParams().height = bitmapHeight;
    }

    public void btnUpClick(View v) {
        imageViewTop.setImageDrawable(bitmapDrawable);
        imageViewTop.getLayoutParams().width = bitmapWidth;
        imageViewTop.getLayoutParams().height = bitmapHeight;
        imageViewBottom.setImageDrawable(null);
    }

    public void btnDownClick(View v) {
        imageViewBottom.setImageDrawable(bitmapDrawable);
        imageViewBottom.getLayoutParams().width = bitmapWidth;
        imageViewBottom.getLayoutParams().height = bitmapHeight;
        imageViewTop.setImageDrawable(null);
    }
}