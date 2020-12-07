package com.example.doitmission_09;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MemberInputFragment extends Fragment {
    Calendar calendar = Calendar.getInstance();

    EditText name;
    EditText age;

    Button btn_birth;
    Button btn_save;

    private final DatePickerDialog.OnDateSetListener callbackMethod = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
            btn_birth.setText(simpleDateFormat.format(calendar.getTime()));
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_member_input, container, false);

        btn_birth = root.findViewById(R.id.birthday);
        btn_save = root.findViewById(R.id.btn_save);
        name = root.findViewById(R.id.name);
        age = root.findViewById(R.id.age);

        Date currentTime = Calendar.getInstance().getTime();
        btn_birth.setText(new SimpleDateFormat("yyyy년 MM월 dd일", Locale.getDefault()).format(currentTime));

        btn_birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(getContext(), callbackMethod, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

                dialog.show();
            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "이름 : " + name.getText() + "/나이 : " + age.getText() + "/생년월일 : " + btn_birth.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}