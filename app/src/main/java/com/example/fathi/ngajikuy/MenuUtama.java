package com.example.fathi.ngajikuy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private LinearLayout Pindah1, Pindah2, Pindah3;
    private LinearLayout Tost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Pindah1 = findViewById(R.id.klik1);
        Pindah2 = findViewById(R.id.klik2);
        Pindah3 = findViewById(R.id.klik3);

        Pindah1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent (MenuUtama.this, Dzikir.class);
                startActivity(intent);
            }
        });

        Pindah2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent (MenuUtama.this, Doa.class);
                startActivity(intent);
            }
        });

        Pindah3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent (MenuUtama.this, Tasbih.class);
                startActivity(intent);
            }
        });

       Tost = findViewById(R.id.fulan);

       Tost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MenuUtama.this, "Ahlan Wa Sahlan Fulan ", Toast.LENGTH_LONG).show();
            }
        });
    }
}
