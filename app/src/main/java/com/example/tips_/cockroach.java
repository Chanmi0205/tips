package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cockroach extends AppCompatActivity {

    private Button cockroach_go;
    private ImageView german_cockroach;
    private ImageView american_cockroaches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cockroach);

        american_cockroaches = findViewById(R.id.american_cockroaches);
        american_cockroaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (cockroach.this , american_cockroaches.class);
                startActivity(intent);
            }
        });

        german_cockroach = findViewById(R.id.german_cockroach);
        german_cockroach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cockroach.this , german_cockroach.class);
                startActivity(intent);      // 이미지 클릭 시 미국 바퀴벌레 설명 화면으로 이동
            }
        });

        cockroach_go = findViewById(R.id.cockroach_go);
        cockroach_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}