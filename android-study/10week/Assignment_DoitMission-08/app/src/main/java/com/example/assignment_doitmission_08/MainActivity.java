package com.example.assignment_doitmission_08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;

    final static int REQUEST_MENU = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText idInput = findViewById(R.id.idInput);
                EditText pwInput = findViewById(R.id.pwInput);

                if (idInput.getText().toString().isEmpty() || pwInput.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "아이디와 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(getApplicationContext(), MainMenuActivity.class);
                    intent.putExtra("fromLogin", true);
                    intent.putExtra("data", "로그인하기 화면에서 보내온 응답입니다.");

                    startActivityForResult(intent, REQUEST_MENU);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            Toast.makeText(this, data.getStringExtra("data"), Toast.LENGTH_SHORT).show();
        }
    }
}