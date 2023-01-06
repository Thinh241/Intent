package com.example.myapplication;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    TextView tv;
    RadioGroup rb;
    RadioButton rb1, rb2, rb3;
    Button bt1, bt2, bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.editTextNumber2);

        rb = findViewById(R.id.radiogroup);
        rb1 = findViewById(R.id.coso2);
        rb2 = findViewById(R.id.coso8);
        rb3 = findViewById(R.id.coso16);

        bt1 = findViewById(R.id.xoa);
        bt2 = findViewById(R.id.Chuyen);
        bt3 = findViewById(R.id.thoat);

        tv = findViewById(R.id.textview3);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
            }
        });

        rb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int n;
                n = Integer.valueOf(edt1.getText().toString());
                if(rb1.isChecked()){
                    tv.setText(Integer.toBinaryString(n));
                }
                if (rb2.isChecked()){
                    tv.setText(Integer.toOctalString(n));
                }
                if (rb3.isChecked()){
                    tv.setText(Integer.toHexString(n));
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n ;
                n = Integer.valueOf(edt1.getText().toString());
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("n", n);
                startActivity(i);
            }
        });


    }
}