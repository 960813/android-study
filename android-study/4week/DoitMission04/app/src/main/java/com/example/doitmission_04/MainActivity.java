package com.example.doitmission_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.sms_content);
        textView = findViewById(R.id.sms_byte);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try {
                    byte[] byteText = editText.getText().toString().getBytes("KSC5601");
                    textView.setText(byteText.length + "/80 바이트");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    byte[] byteText = editable.toString().getBytes("KSC5601");
                    if (byteText.length > 80) {
                        editable.delete(editable.length() - 2, editable.length() - 1);
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void sendSMS(View v) {
        Toast.makeText(MainActivity.this.getApplicationContext(), editText.getText(), Toast.LENGTH_LONG).show();
        editText.setText("");
    }
}