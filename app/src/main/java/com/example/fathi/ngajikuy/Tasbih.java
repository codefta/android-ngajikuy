package com.example.fathi.ngajikuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tasbih extends AppCompatActivity {

    TextView Zikir1, Zikir2, Zikir3;
    Button Button1, Button2, Button3, Button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);
        Zikir1 = findViewById(R.id.zikir1);
        Zikir2 = findViewById(R.id.zikir2);
        Zikir3 = findViewById(R.id.zikir3);
        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.rst);
        Zikir1.setText("0");
        Zikir2.setText("0");
        Zikir3.setText("0");

        Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int dzikir1 = Integer.valueOf(Zikir1.getText().toString());
                dzikir1 = dzikir1 + 1;
                Zikir1.setText(String.valueOf(dzikir1));
            }
        });

        Button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int dzikir1 = Integer.valueOf(Zikir2.getText().toString());
                dzikir1 = dzikir1 + 1;
                Zikir2.setText(String.valueOf(dzikir1));
            }
        });

        Button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int dzikir1 = Integer.valueOf(Zikir3.getText().toString());
                dzikir1 = dzikir1 + 1;
                Zikir3.setText(String.valueOf(dzikir1));
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dzikir1 = Integer.valueOf(Zikir1.getText().toString());
                int dzikir2 = Integer.valueOf(Zikir2.getText().toString());
                int dzikir3 = Integer.valueOf(Zikir3.getText().toString());
                dzikir1 = dzikir1 * dzikir2 * dzikir3 * 0;
                Zikir1.setText(String.valueOf(dzikir1));
                Zikir2.setText(String.valueOf(dzikir1));
                Zikir3.setText(String.valueOf(dzikir1));
            }
        });
    }
}
