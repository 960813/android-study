package com.example.doitmission_09;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    private DatePickerDialog.OnDateSetListener callbackMethod = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            editText.setText(year + "년 " + month + "월 " + dayOfMonth + "일");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.birthday);

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(getApplicationContext(), callbackMethod, 2019, 5, 24);

                dialog.show();
            }
        });
    }
}