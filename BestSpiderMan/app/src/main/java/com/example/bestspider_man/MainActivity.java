package com.example.bestspider_man;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        textView2 = findViewById(R.id.textView2);
        String bad = "EW";
        String mid = "MID";
        String good = "GOOD CHOICE!";

        button.setOnClickListener(view -> textView2.setText(bad));

        button2.setOnClickListener(view -> textView2.setText(mid));

        button3.setOnClickListener(view -> textView2.setText(good));

    }
}