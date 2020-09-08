package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 콜백 메소드
        super.onCreate(savedInstanceState);
        // MainActivity -> activity_main.xml 세팅
        // res Folder는 R 클래스로 객체화 되어 호출 할 수 있다.
        // R.layout <-> res/layout
        setContentView(R.layout.activity_main);
    }

    public void MyClick(View v) {
        Toast.makeText(this, "확인버튼이 눌렸어요", Toast.LENGTH_LONG).show();
    }

    public void MyClick1(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://jupiterflow.com"));
        startActivity(myIntent);
    }

    public void MyClick2(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(myIntent);
    }
}