package com.example.dimysiklapo4ka.mysecondaplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

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

        requestWindowFeature(Window.FEATURE_NO_TITLE);

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

        String tmp = "";
        String tmp2;
        String tmpRez = "";
        int countSum = 0;

    switch (view.getId()){

        case R.id.btn_clear:{
            if (editText2.length() != 0){
                editText2.setText("");
            }else {
                editText2.setText("0");
            }
            break;
        }
        case R.id.btn_sum:{
            countSum ++;
            if (editText2.length() == 0){
                editText2.setText("0");
            }
            else {
                tmp = ("" + editText2.getText()).substring(0, editText2.getText().length() );
            }
            if (countSum > 1){
                tmp2 = ("" + editText2.getText()).substring(tmp.length()+1, editText2.getText().length());
                int tmpOne = Integer.parseInt(tmp);
                int tmpTwo = Integer.parseInt(tmp2);
                int rez = tmpOne + tmpTwo;
                tmpRez = "" + rez;

            }
            editText2.setText("" + tmpRez + "+");
            editText2.getText();
            break;
        }
        case R.id.btn_equal:{
            tmp2 = ("" + editText2.getText()).substring(tmp.length()+1, editText2.getText().length()-2);
            int tmpOne = Integer.parseInt(tmp);
            int tmpTwo = Integer.parseInt(tmp2);
            int rez = tmpOne + tmpTwo;
            editText2.setText("" + rez);
            editText2.getText();
            break;
        }
        default:{
            editText2.setText("" + editText2.getText() + ((Button)view).getText());
        }

    }
    }


}
