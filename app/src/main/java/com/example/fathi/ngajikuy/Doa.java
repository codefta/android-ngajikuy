package com.example.fathi.ngajikuy;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doa extends AppCompatActivity {
    private Button Sumber_Dial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        Sumber_Dial = (Button) findViewById(R.id.btn_sumber2);

        Sumber_Dial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(Doa.this);
                builder.setTitle("Sumber Tulisan");
                builder.setMessage("http://rumaysho.com");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
