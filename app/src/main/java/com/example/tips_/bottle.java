package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bottle extends AppCompatActivity {

    private Button bottle_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle);

        bottle_go = findViewById(R.id.bottle_go);
        bottle_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (bottle.this , removal.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });
    }
}