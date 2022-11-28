package com.example.pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class HieuLayout extends AppCompatActivity {
    EditText mNumber1, mNumber2;
    TextView mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hieu_layout);
        mNumber1 = findViewById(R.id.etNumber1);
        mNumber2 = findViewById(R.id.etNumber2);
        mResult = findViewById(R.id.tvResult);


    }

    public void btADD_click(View view) {
        int num1= Integer.parseInt(mNumber1.getText().toString());
        int num2= Integer.parseInt(mNumber2.getText().toString());
        int sesult = num1 + num2;
        mResult.setText(String .format("%d + %d = %d", num1,num2,sesult));

    }

}