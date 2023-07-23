package com.example.fakecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                int ans = Integer.parseInt(editText1.getText().toString())+ Integer.parseInt(editText2.getText().toString());
//                textView.setText( "ANS = " + ans);
//            }
//        });

    }

    public void add(View view){
        String temp1 = editText1.getText().toString();
        String temp2 = editText2.getText().toString();
        int num1 = Integer.parseInt(temp1);
        int num2 = Integer.parseInt(temp2);

        int ans = num1 + num2;
        textView.setText("" + ans + "");
    }
}