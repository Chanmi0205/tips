package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class worm extends AppCompatActivity {

    private Button worm_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worm);

        worm_go = findViewById(R.id.worm_go);
        worm_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(worm.this, learn.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}