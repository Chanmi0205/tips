package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qa extends AppCompatActivity {

    private Button qa_go;
    private Button q1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa);

        q1 = findViewById(R.id.q1);
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(qa.this, qa1.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });


        qa_go = findViewById(R.id.qa_go);
        qa_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(qa.this, MainActivity.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}