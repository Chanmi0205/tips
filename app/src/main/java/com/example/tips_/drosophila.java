package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class drosophila extends AppCompatActivity {

    private Button drosophila_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drosophila);

        drosophila_go = findViewById(R.id.drosophila_go);
        drosophila_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(drosophila.this, worm.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}