package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstnumber = findViewById(R.id.first);
        EditText secondnumber = findViewById(R.id.second);
        Button sum = findViewById(R.id.button);
        TextView result = findViewById(R.id.Result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstnumber.getText().toString();
                String b = secondnumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z =  x + y;

                result.setText(z + "");


            }
        });
    }
}