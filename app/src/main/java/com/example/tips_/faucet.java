package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class faucet extends AppCompatActivity {

    private Button faucet_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faucet);

        faucet_go = findViewById(R.id.faucet_go);
        faucet_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(faucet.this , cleaning.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}