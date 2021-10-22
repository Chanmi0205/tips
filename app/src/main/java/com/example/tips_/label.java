package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class label extends AppCompatActivity {

    private Button lavel_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label);

        lavel_go = findViewById(R.id.lavel_go);
        lavel_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();        // 전 화면으로 돌아가기
            }
        });
    }
}