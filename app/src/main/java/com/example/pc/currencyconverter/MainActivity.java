package com.example.pc.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText editText = findViewById(R.id.editText);
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter Amount ", Toast.LENGTH_LONG).show();
        } else {
            double value = Double.parseDouble(editText.getText().toString());
            int d = (int) (value * 69.77);
            Toast.makeText(this, d + " Rs", Toast.LENGTH_LONG).show();
        }
    }
}


