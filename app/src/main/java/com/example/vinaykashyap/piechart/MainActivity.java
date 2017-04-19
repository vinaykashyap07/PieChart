package com.example.vinaykashyap.piechart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eText;
    EditText option1, option2,option3,option4;
    String ques, opt1,opt2, opt3, opt4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (EditText) findViewById(R.id.edittext);
        option1 = (EditText) findViewById(R.id.text1);
        option2 = (EditText) findViewById(R.id.text2);
        option3 = (EditText) findViewById(R.id.text3);
        option4 = (EditText) findViewById(R.id.text4);

         ques = eText.getText().toString();
         opt1 = eText.getText().toString();
         opt2 = eText.getText().toString();
         opt3 = eText.getText().toString();
         opt4 = eText.getText().toString();

//        button = (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, ques, Toast.LENGTH_SHORT).show();
//
//            }
//        });



    }
}