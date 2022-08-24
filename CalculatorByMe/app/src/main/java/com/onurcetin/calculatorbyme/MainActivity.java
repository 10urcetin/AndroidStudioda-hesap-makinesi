package com.onurcetin.calculatorbyme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =findViewById(R.id.Number1Text);
        num2=findViewById(R.id.Number2Text);
        resultText=findViewById(R.id.resultText);


    }
    public void topla(View view){
        if(num1.getText().toString().matches("")||num2.getText().toString().matches("")){
            resultText.setText("Please enter the number");

        }else{
            int number1= Integer.parseInt(num1.getText().toString());
            int number2= Integer.parseInt(num2.getText().toString());

            int result=number1+number2;
            resultText.setText("Result: "+result);
        }



    }
    public void cıkar(View view){
        if(num1.getText().toString().matches("")||num2.getText().toString().matches("")){
            resultText.setText("Please enter the number");

        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }



    }
    public void carp(View view){
        if(num1.getText().toString().matches("")||num2.getText().toString().matches("")){
            resultText.setText("Please enter the number");

        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }



    }
    public void bol(View view){
        if(num1.getText().toString().matches("")||num2.getText().toString().matches("")){
            resultText.setText("Please enter the number");

        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result: " + result);
        }


    }
}