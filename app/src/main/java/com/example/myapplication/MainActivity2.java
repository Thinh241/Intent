package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int n;
    TextView tv1;
    Button b1, b2, b3, b4;
    long sum=0, start = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = findViewById(R.id.ketqua);
        b1 = findViewById(R.id.tong);
        b2 = findViewById(R.id.giaithua);
        b3 = findViewById(R.id.xoa);
        b4 = findViewById(R.id.thoat);

        Intent i2 = getIntent();
        n = i2.getIntExtra("n", 10);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i =1; i <= n; i++ ){
                    sum +=i;
                }
                tv1.setText(String.valueOf(sum));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 1; i <= n; i++){
                    start = start * i;
                }
                tv1.setText(String.valueOf(start));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}