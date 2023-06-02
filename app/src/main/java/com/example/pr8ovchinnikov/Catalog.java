package com.example.pr8ovchinnikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public abstract class Catalog extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2, btn3, btn4, btn5;
    TextView txt, txt1, txt2, txt3;
    protected int a = 1, b = 1, c = 1500, d = 950;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        btn = (Button) findViewById(R.id.button4);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button5);
        txt = (TextView) findViewById(R.id.textView3);
        txt1 = (TextView) findViewById(R.id.textView6);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                c += 1500;
                display(a);
                display3(c);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a--;
                c -= 1500;
                display(a);
                display3(c);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b--;
                d -= 950;
                display2(b);
                display4(d);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                d += 950;
                display2(b);
                display4(d);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {//переход на 2 экран в корзину
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Catalog.this, Basket.class);
                startActivity(intent);
            }
        });
    }

    public void display(int n) {
        txt.setText("" + n);
    }

    public void display2(int n) {
        txt1.setText("" + n);
    }

    public void display3(int n) {
        txt2.setText("" + n);
    }

    public void display4(int n) {
        txt3.setText("" + n);
    }
}
