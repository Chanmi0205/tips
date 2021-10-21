package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tape extends AppCompatActivity {

    private Button sink_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tape);

        sink_go = findViewById(R.id.sink_go);
        sink_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (tape.this , removal.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}