package com.example.kuntalchaudhari.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.util.Output;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1EditText,num2EditText;
    Button addButton,subButton,mulButton,divButton;
    double num1,num2,num3;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) // called to do initial creation of fragment.
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText=findViewById(R.id.number1);
        num2EditText=findViewById(R.id.number2);
        addButton=findViewById(R.id.addButton);
        subButton=findViewById(R.id.subButton);
        mulButton=findViewById(R.id.mulButton);
        divButton=findViewById(R.id.divButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(num1EditText.getText().toString());
                num2=Double.parseDouble(num2EditText.getText().toString());

                num3=num1+num2;

                result="Sum is "+num3;

                @SuppressLint({"NewApi", "LocalSuppress"}) Intent myIntent=new Intent(MainActivity.this,Output.class);
                myIntent.putExtra("result",result);
                startActivity(myIntent);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(num1EditText.getText().toString());
                num2=Double.parseDouble(num2EditText.getText().toString());

                num3=num1-num2;

                result="Sub is "+num3;

                Intent myIntent=new Intent(MainActivity.this,Output.class);
                myIntent.putExtra("result",result);
                startActivity(myIntent);
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(num1EditText.getText().toString());
                num2=Double.parseDouble(num2EditText.getText().toString());

                num3=num1*num2;

                result="Mul is "+num3;

                @SuppressLint({"NewApi", "LocalSuppress"}) Intent myIntent=new Intent(MainActivity.this,Output.class);
                myIntent.putExtra("result",result);
                startActivity(myIntent);
            }
        });}}
