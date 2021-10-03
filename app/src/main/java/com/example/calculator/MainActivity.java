package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.calculator.databinding.CalculatorBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private CalculatorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = CalculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> add());
        binding.minus.setOnListener(v -> {
            binding.option.setText("-");
        });
        binding.plus.setOnClickListener(v-> {
            binding.option.setText("+");
        });
        binding.multiply.setOnClickListener(v-> {
            binding.option.setText("*");
        });
        binding.divide.setOnClickListener(v-> {
            binding.option.setText("/");
        });

    }

    private void add() {
        int left = Integer.parseInt(binding.inputnum1.getText().toString());
        int right = Integer.parseInt(binding.inputnum2.getText().toString());
        int result = left +right;

        binding.result.setText(Integer.toString(result));
    }
}