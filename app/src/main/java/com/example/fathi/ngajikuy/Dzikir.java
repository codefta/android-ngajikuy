package com.example.fathi.ngajikuy;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dzikir extends AppCompatActivity {
    private Button dial_sumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir);

        dial_sumber = (Button) findViewById(R.id.btn_sumber);

        dial_sumber.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(Dzikir.this);
                builder.setTitle("Sumber Tulisan");
                builder.setMessage("http://rumaysho.com");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
