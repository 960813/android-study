package com.example.assignment_doitmission_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        Button goToMenu = findViewById(R.id.pay_gotomenu);
        Button goToLogin = findViewById(R.id.pay_gotologin);

        goToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data", "매출 관리 화면에서 보내온 응답입니다.");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("login", true);
                intent.putExtra("data", "매출 관리 화면에서 보내온 응답입니다.");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}