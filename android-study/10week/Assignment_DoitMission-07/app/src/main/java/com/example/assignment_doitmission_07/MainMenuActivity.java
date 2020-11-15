package com.example.assignment_doitmission_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainMenuActivity extends AppCompatActivity {
    Button pay, customer, product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        pay = (Button) findViewById(R.id.pay);
        customer = (Button) findViewById(R.id.customer);
        product = (Button) findViewById(R.id.product);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                switch (view.getId()){
                    case R.id.pay:
                        intent.putExtra("data", "매출 관리");
                        break;
                    case R.id.customer:
                        intent.putExtra("data", "고객 관리");
                        break;
                    case R.id.product:
                        intent.putExtra("data", "상품 관리");
                        break;
                }
                setResult(RESULT_OK, intent);
                finish();
            }
        };

        pay.setOnClickListener(onClickListener);
        customer.setOnClickListener(onClickListener);
        product.setOnClickListener(onClickListener);
    }
}