package com.example.sampleorientation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate 호출됨", Toast.LENGTH_SHORT).show();

        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼을 클릭했을 때 사용자가 입력한 값을 name 변수에 할당
                name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "입력된 값을 변수에 저장했습니다 : " + name, Toast.LENGTH_SHORT).show();
            }
        });

        if (savedInstanceState != null) {
            name = savedInstanceState.getString("name");
            Toast.makeText(this, "값을 복원했습니다 : " + name, Toast.LENGTH_SHORT).show();
            editText.setText(name);
        }
    }

    // 화면 전환 시 Stop -> Destroy -> Start 순으로 Cycle 순환이 일어난다.
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart 호출됨", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop 호출됨", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy 호출됨", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // name 변수의 값 저장
        outState.putString("name", name);
    }

//    @Override
//    public void onConfigurationChanged(@NonNull Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            Toast.makeText(this, "방향 : ORIENTATION_LANDSCAPE", Toast.LENGTH_SHORT).show();
//        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            Toast.makeText(this, "방향 : ORIENTATION_PORTRAIT", Toast.LENGTH_SHORT).show();
//        }
//    }
}