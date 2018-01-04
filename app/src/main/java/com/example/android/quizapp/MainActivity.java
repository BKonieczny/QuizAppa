package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // check first questions and return true when is correct
    public boolean checkAnswer1(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(checkedRadioButtonId);
        int idx = radioGroup.indexOfChild(radioButton);

        if (idx == -1) {
            //No item selected

            return false;
        } else {
            if (idx == 0) {
                // when first radiobutton is checked. first element has id equals 0
                return true;
            } else {

                return false;
            }
        }
    }


    // check second questions and return true when is correct
    public boolean checkAnswer2(View view) {
        EditText editText = (EditText) findViewById(R.id.answer2);
        String answer = editText.getText().toString();

        if (answer.equals("Apple")) {
            //equals two strings and if answer is correct return true
            return true;
        } else {
            return false;
        }
    }

    // check 3th questions and return true when is correct
    public boolean checkAnswer3(View view) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.answer3_chck1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.answer3_chck2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.answer3_chck3);

        if (checkBox1.isChecked() && checkBox2.isChecked() && (checkBox3.isChecked() == false)) {
            {
                // if only first and secend CheckBox is checked return true - answer is correct
                return true;
            }

        } else {
            return false;
        }
    }

    // check 4th questions and return true when is correct
    public boolean checkAnswer4(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group2);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(checkedRadioButtonId);
        int idx = radioGroup.indexOfChild(radioButton);

        if (idx == -1) {
            //No item selected

            return false;
        } else {
            if (idx == 1) {

                return true;
            } else {
                return false;
            }
        }

    }

    // check 5th questions and return true when is correct
    public boolean checkAnswer5(View view) {
        EditText editText = (EditText) findViewById(R.id.answer5);
        String answer = editText.getText().toString();


        if (answer.equals("Einstein")) {
            return true;
        } else {
            return false;
        }
    }

    // check 6th questions and return true when is correct
    public boolean checkAnswer6(View view) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.answer6_chck1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.answer6_chck2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.answer6_chck3);

        if (checkBox2.isChecked() && checkBox3.isChecked() && (checkBox1.isChecked() == false)) {
            {
                return true;
            }

        } else {
            return false;
        }

    }

    public void sendAnswer(View view) {
        boolean answer1;
        boolean answer2;
        boolean answer3;
        boolean answer4;
        boolean answer5;
        boolean answer6;

        answer1 = checkAnswer1(view);
        answer2 = checkAnswer2(view);
        answer3 = checkAnswer3(view);
        answer4 = checkAnswer4(view);
        answer5 = checkAnswer5(view);
        answer6 = checkAnswer6(view);

        if (answer1 && answer2 && answer3 && answer4 && answer5 && answer6) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.win_text, Toast.LENGTH_LONG);
            toast.show();
// if all answers are correct we show toast mesaage

        } else {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.lose_text, Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
