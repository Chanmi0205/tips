package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cleaning extends AppCompatActivity {

    private Button cleaning_go;
    private Button tile;
    private Button sink;
    private Button gas_stove;
    private Button faucet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning);

        faucet = findViewById(R.id.faucet);
        faucet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cleaning.this , faucet.class); // 수도꼭지 화면으로 이동
                startActivity(intent);
            }
        });

        gas_stove = findViewById(R.id.gas_stove);
        gas_stove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cleaning.this , gas_stove.class); // 가스레인지 화면으로 이동
                startActivity(intent);
            }
        });

        sink = findViewById(R.id.sink);
        sink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cleaning.this , sink.class);  // 싱크대 화면으로 이동
                startActivity(intent);
            }
        });

        tile = findViewById(R.id.tile);
        tile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cleaning.this , tile.class);  // 타일 화면으로 이동
                startActivity(intent);
            }
        });


        cleaning_go = findViewById(R.id.cleaning_go);
        cleaning_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}