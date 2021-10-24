package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qa extends AppCompatActivity {

    private Button qa_go;
    private Button qa1;
    private Button qa2;
    private Button qa3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa);

        qa3 = findViewById(R.id.qa3);
        qa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( qa.this , qa3.class);  // qa3화면으로 이동
                startActivity(intent);
            }
        });

        qa2 = findViewById(R.id.qa2);
        qa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (qa.this , qa2.class);  // qa2화면으로 이동
                startActivity(intent);
            }
        });


        qa1 = findViewById(R.id.qa1);
        qa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(qa.this, qa1.class);  // qa1화면으로 이동
                startActivity(intent);
            }
        });


        qa_go = findViewById(R.id.qa_go);
        qa_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}