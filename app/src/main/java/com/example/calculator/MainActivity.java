package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.calculator.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonEnter.setOnClickListener(v -> calculator());
        binding.buttonAdd.setOnClickListener(v -> {
            binding.operator.setText("+");
        });
        binding.buttonEnter.setOnClickListener(v -> calculator());
        binding.buttonMinus.setOnClickListener(v-> {
            binding.operator.setText("-");
        });
        binding.buttonEnter.setOnClickListener(v -> calculator());
        binding.buttonMultiply.setOnClickListener(v-> {
            binding.operator.setText("*");
        });
        binding.buttonEnter.setOnClickListener(v -> calculator()p);
        binding.buttonDivide.setOnClickListener(v-> {
            binding.operator.setText("/");
        });

    }


    private void calculator() {
        String op = binding.operator.getText().toString();
        int result = 0;

        if (op.compareTo("+") == 0){
            int left = Integer.parseInt(binding.inputnum1.getText().toString());
            int right = Integer.parseInt(binding.inputnum2.getText().toString());
            result = left + right;

        }else if(op.compareTo("-") ==0){
            int left = Integer.parseInt(binding.inputnum1.getText().toString());
            int right = Integer.parseInt(binding.inputnum2.getText().toString());
            result = left - right;

        }else if(op.compareTo("*") ==0){
            int left = Integer.parseInt(binding.inputnum1.getText().toString());
            int right = Integer.parseInt(binding.inputnum2.getText().toString());
            result = left * right;

        }else{
            int left = Integer.parseInt(binding.inputnum1.getText().toString());
            int right = Integer.parseInt(binding.inputnum2.getText().toString());
            result = left / right;

        }

        binding.result.setText(Integer.toString(result));
        Log.i("debug", "selected operator" + binding.operator.getText());

    }

}