package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laver extends AppCompatActivity {

    private Button laver_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laver);


        laver_go = findViewById(R.id.laver_go);
        laver_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();      // 전 화면으로 돌아가기
            }
        });

    }
}