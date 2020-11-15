package com.example.assignment_doitmission_08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {
    Button pay, customer, product;

    final static int REQUEST_PAY = 300;
    final static int REQUEST_CUSTOMER = 400;
    final static int REQUEST_PRODUCT = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        
        Intent intent = getIntent();
        if (intent.getBooleanExtra("fromLogin", false)) {
            Toast.makeText(this, intent.getStringExtra("data"), Toast.LENGTH_SHORT).show();
        }

        pay = (Button) findViewById(R.id.pay);
        customer = (Button) findViewById(R.id.customer);
        product = (Button) findViewById(R.id.product);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                switch (view.getId()) {
                    case R.id.pay:
                        intent = new Intent(getApplicationContext(), PayActivity.class);
                        startActivityForResult(intent, REQUEST_PAY);
                        break;
                    case R.id.customer:
                        intent = new Intent(getApplicationContext(), CustomerActivity.class);
                        startActivityForResult(intent, REQUEST_CUSTOMER);
                        break;
                    case R.id.product:
                        intent = new Intent(getApplicationContext(), ProductActivity.class);
                        startActivityForResult(intent, REQUEST_PRODUCT);
                        break;
                }
            }
        };

        pay.setOnClickListener(onClickListener);
        customer.setOnClickListener(onClickListener);
        product.setOnClickListener(onClickListener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (data.getBooleanExtra("login", false)) {
                setResult(RESULT_OK, data);
                finish();
            } else {
                Toast.makeText(this, data.getStringExtra("data"), Toast.LENGTH_SHORT).show();
            }
        }
    }
}