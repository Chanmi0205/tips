package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gas_stove extends AppCompatActivity {

    private Button gas_stove_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_stove);

        gas_stove_go = findViewById(R.id.gas_stove_go);
        gas_stove_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gas_stove.this , cleaning.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}