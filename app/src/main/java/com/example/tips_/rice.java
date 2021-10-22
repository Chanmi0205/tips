package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rice extends AppCompatActivity {

    private Button rice_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        rice_go = findViewById(R.id.rice_go);
        rice_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();        // 전 화면으로 돌아가기
            }
        });

    }
}