package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1Button = (Button)findViewById(R.id.b1);
        Button b2Button = (Button)findViewById(R.id.b2);
        Button b3Button = (Button)findViewById(R.id.b3);
        Button b4Button = (Button)findViewById(R.id.b4);
        Toast.makeText(this, "숫자 2개를 입력하세요.", Toast.LENGTH_SHORT).show();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Edit = (EditText)findViewById(R.id.Edit);
                int num1 = Integer.parseInt(Edit.getText().toString());
                EditText Edit2 = (EditText)findViewById(R.id.Edit2);
                int num2 = Integer.parseInt(Edit2.getText().toString());
                int result;
                TextView textView = (TextView)findViewById(R.id.textView);

                switch (v.getId()){
                    case R.id.b1:
                        result = num1 + num2;
                        textView.setText(Integer.toString(result));
                        break;
                    case  R.id.b2:
                        result = num1 - num2;
                        textView.setText(Integer.toString(result));
                        break;
                    case R.id.b3:
                        result = num1/num2;
                        textView.setText(Integer.toString(result));
                        break;
                    case  R.id.b4:
                            result = num1*num2;
                            textView.setText(Integer.toString(result));
                            break;

                }

            }
        };
        b1Button.setOnClickListener(listener);
        b2Button.setOnClickListener(listener);
        b3Button.setOnClickListener(listener);
        b4Button.setOnClickListener(listener);

            }
        };

