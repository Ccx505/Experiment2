package com.example.experiment2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtInput;
    private String currentInput = "";
    private String operator = "";
    private double firstNumber = 0;
    private boolean isNewOperation = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtInput = findViewById(R.id.txtInput);

        // 所有按钮的ID
        int[] buttonIds = {
                R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9,
                R.id.buttonAdd, R.id.buttonSub, R.id.buttonMul, R.id.buttonDiv,
                R.id.buttonDot, R.id.buttonEq
        };

        // 给所有按钮绑定点击事件
        for (int id : buttonIds) {
            findViewById(id).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button) v;
        String text = btn.getText().toString();

        switch (text) {
            case "+":
            case "-":
            case "×":
            case "/":
                operator = text;
                firstNumber = Double.parseDouble(currentInput.isEmpty() ? "0" : currentInput);
                isNewOperation = true;
                break;

            case "=":
                calculateResult();
                break;

            case ".":
                if (!currentInput.contains(".")) {
                    currentInput += ".";
                    txtInput.setText(currentInput);
                }
                break;

            default:
                // 数字输入
                if (isNewOperation) {
                    currentInput = text;
                    isNewOperation = false;
                } else {
                    currentInput += text;
                }
                txtInput.setText(currentInput);
                break;
        }
    }

    private void calculateResult() {
        if (operator.isEmpty() || currentInput.isEmpty()) return;

        double secondNumber = Double.parseDouble(currentInput);
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "×":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    txtInput.setText("错误");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
        }

        txtInput.setText(String.valueOf(result));
        currentInput = String.valueOf(result);
        operator = "";
        isNewOperation = true;
    }
}
