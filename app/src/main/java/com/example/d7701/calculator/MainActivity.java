package com.example.d7701.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4;
    EditText et1, et2, etR;
    int num1, num2, numR;
    String strNum1, strNum2, strNumR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1 = findViewById(R.id.et1);
                strNum1 = et1.getText().toString();
                num1 = Integer.parseInt(strNum1);

                et2 =  findViewById(R.id.et2);
                strNum2 = et2.getText().toString();
                num2 = Integer.parseInt(strNum2);

                etR = findViewById(R.id.etR);
                strNumR = etR.getText().toString();

                numR = num1 + num2;
                strNumR = numR + "";
                etR.setText(strNumR);
            }
        });

        bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1 = findViewById(R.id.et1);
                strNum1 = et1.getText().toString();
                num1 = Integer.parseInt(strNum1);

                et2 =  findViewById(R.id.et2);
                strNum2 = et2.getText().toString();
                num2 = Integer.parseInt(strNum2);

                etR = findViewById(R.id.etR);
                strNumR = etR.getText().toString();

                numR = num1 - num2;
                strNumR = numR + "";
                etR.setText(strNumR);
            }
        });

        bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1 = findViewById(R.id.et1);
                strNum1 = et1.getText().toString();
                num1 = Integer.parseInt(strNum1);

                et2 =  findViewById(R.id.et2);
                strNum2 = et2.getText().toString();
                num2 = Integer.parseInt(strNum2);

                etR = findViewById(R.id.etR);
                strNumR = etR.getText().toString();

                numR = num1 * num2;
                strNumR = numR + "";
                etR.setText(strNumR);
            }
        });

        bt4 = findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1 = findViewById(R.id.et1);
                strNum1 = et1.getText().toString();
                num1 = Integer.parseInt(strNum1);

                et2 =  findViewById(R.id.et2);
                strNum2 = et2.getText().toString();
                num2 = Integer.parseInt(strNum2);

                etR = findViewById(R.id.etR);
                strNumR = etR.getText().toString();

                numR = num1 / num2;
                strNumR = numR + "";
                etR.setText(strNumR);
            }
        });
    }
}
