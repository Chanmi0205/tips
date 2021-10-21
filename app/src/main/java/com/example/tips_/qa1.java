package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qa1 extends AppCompatActivity {

    private Button qa1_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa1);

        qa1_go = findViewById(R.id.qa1_go);
        qa1_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(qa1.this, qa.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}