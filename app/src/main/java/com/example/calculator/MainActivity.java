package com.example.calculator;

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


        binding.buttonEnter.setOnClickListener(v -> add());
        binding.operator.setOnClickListener(v -> {
            binding.result.setText("+");
        });

        binding.operator.setOnClickListener(v-> {
            binding.result.setText("-"); });

        binding.operator.setOnClickListener(v-> {
            binding.result.setText("-");
        });
        binding.operator.setOnClickListener(v-> {
            binding.result.setText("*");
        });
        binding.operator.setOnClickListener(v-> {
            binding.result.setText("/");
        });

    }

    private void add() {
        int left = Integer.parseInt(binding.inputnum1.getText().toString());
        int right = Integer.parseInt(binding.inputnum2.getText().toString());
        int result = left +right;

        binding.result.setText(Integer.toString(result));
    }
}