package com.example.vijaysankar.application;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout contain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        contain = (ConstraintLayout) findViewById(R.id.container);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
                contain.setBackgroundColor(Color.RED);
                break;
            case R.id.button1:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                contain.setBackgroundColor(Color.BLUE);

                break;
            case R.id.button2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                contain.setBackgroundColor(Color.GREEN);

                break;
            case R.id.button3:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                contain.setBackgroundColor(Color.MAGENTA);

                break;
        }
    }
}
