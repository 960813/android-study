package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));

                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent intent = new Intent();
                // 명시적 호출
                // Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class)

                // Component 이용한 명시적 호출(원래는 암시적 호출): 패키지명까지 입력
                // 동일 프로젝트가 아니더라도 호출할 수 있음.
                // ComponentName name = new ComponentName("com.example.intent_2", "com.example.intent_2.MainActivity2");
                // intent.setComponent(name);
                // startActivity(intent);

                Intent intent = new Intent("MyAction");
                startActivity(intent);
            }
        });
    }
}