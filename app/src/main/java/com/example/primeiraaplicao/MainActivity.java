package com.example.primeiraaplicao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public static final String VALUE = "com.example.primeiraaplicao.VALOR";

    private EditText editTextTextNumber;
    private EditText editTextTextNumber2;
    private TextView textViewNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textViewNumber = (TextView) findViewById(R.id.textViewNumber);

        editTextTextNumber = (EditText) findViewById(R.id.editTextTextNumber);

        editTextTextNumber2 = (EditText) findViewById(R.id.editTextTextNumber2);

        FloatingActionButton sum = findViewById(R.id.floatingActionButtonSum);

        FloatingActionButton sub = findViewById(R.id.floatingActionButtonSubtract);

        FloatingActionButton mul = findViewById(R.id.floatingActionButtonMultiply);

        FloatingActionButton div = findViewById(R.id.floatingActionButtonDivision);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer n1 = Integer.parseInt(editTextTextNumber.getText().toString());

                Integer n2 = Integer.parseInt(editTextTextNumber2.getText().toString());

                Integer number = n1 + n2;

                textViewNumber.setText(number.toString());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer n1 = Integer.parseInt(editTextTextNumber.getText().toString());

                Integer n2 = Integer.parseInt(editTextTextNumber2.getText().toString());

                Integer number = n1 - n2;

                textViewNumber.setText(number.toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer n1 = Integer.parseInt(editTextTextNumber.getText().toString());

                Integer n2 = Integer.parseInt(editTextTextNumber2.getText().toString());

                Integer number = n1 * n2;

                textViewNumber.setText(number.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double n1 = Double.parseDouble(editTextTextNumber.getText().toString());

                Double n2 = Double.parseDouble(editTextTextNumber2.getText().toString());

                Double number = n1 / n2;

                DecimalFormat formatar = new DecimalFormat("0.00");

                textViewNumber.setText(formatar.format(number));
            }
        });
    }
}