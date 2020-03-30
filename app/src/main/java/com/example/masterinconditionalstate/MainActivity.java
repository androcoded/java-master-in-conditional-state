package com.example.masterinconditionalstate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber, age;
    Button compareNumbers, isDev;
    TextView getYesOrNot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.edt_first_number_id);
        secondNumber = findViewById(R.id.edt_second_number_id);
        compareNumbers = findViewById(R.id.btn_compare_number_id);
        age = findViewById(R.id.edt_age_id);
        getYesOrNot = findViewById(R.id.edt_quesntion_id);
        isDev = findViewById(R.id.btn_dev_checker_id);
    }

    public void onClickCompare(View v) {

        float numberOne = Float.parseFloat(firstNumber.getText().toString());
        float numberTwo = Float.parseFloat(secondNumber.getText().toString());

        if (numberOne > numberTwo) {
            compareNumbers.setText("Number " + numberOne + " is greater than number " + numberTwo);
        } else if (numberOne < numberTwo) {
            compareNumbers.setText("Number " + numberOne + " is smaller than number " + numberTwo);
        } else {
            compareNumbers.setText("They are equal");
        }

    }

    public void onClickDevCheck(View view) {

        int devAge = Integer.parseInt(age.getText().toString());
        String devYesOrNot = getYesOrNot.getText().toString();

        if (devAge > 18 && devYesOrNot.equals("yes")) {

            isDev.setText("Yes you are a android developer");

        }else{

            isDev.setText("No you are not a dev");

        }


    }
}
