package com.example.dimysiklapo4ka.mysecondaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText2;

    private Button btnClear;
    private Button btnSum;
    private Button btnResult;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = (EditText)findViewById(R.id.editText2);

        btnClear = (Button)findViewById(R.id.btn_clear);
        btnSum = (Button)findViewById(R.id.btn_sum);
        btnResult = (Button)findViewById(R.id.btn_equal);

        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
    }

    public void buttonClick(View view){

    switch (view.getId()){


    }
    }


}
