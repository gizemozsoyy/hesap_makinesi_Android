package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {
    EditText numberonetxt;  TextView resultxt;
    EditText numbertwotxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         numberonetxt=findViewById(R.id.numberone);
         numbertwotxt=findViewById(R.id.numbertwo);
         resultxt=findViewById(R.id.resultxt);



    }

    public void artı (View view) {
        int numberone=Integer.parseInt(numberonetxt.getText().toString());
        int numbertwo=Integer.parseInt(numbertwotxt.getText().toString());
        int result =numberone+numbertwo;
       resultxt.setText(result);

    }
    public void bol(View view){
      int numberone=Integer.parseInt(numberonetxt.getText().toString());
       int  numbertwo=Integer.parseInt(numbertwotxt.getText().toString());
        int result =numberone/numbertwo;
        resultxt.setText(result);

    }
    public void carp(View view){
        int numberone=Integer.parseInt(numberonetxt.getText().toString());
        int numbertwo=Integer.parseInt(numbertwotxt.getText().toString());
        int result=numberone*numbertwo;
        resultxt.setText(result);
    }
    public void cıkar(View view){
        int numberone=Integer.parseInt(numberonetxt.getText().toString());
        int numbertwo=Integer.parseInt(numbertwotxt.getText().toString());
        int result =numberone-numbertwo;
        resultxt.setText(result );
    }
}