package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guitar extends AppCompatActivity {

    private Button guitar_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);

        guitar_go = findViewById(R.id.guitar_go);
        guitar_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guitar.this, learn.class); // 전 화면으로 이동
                startActivity(intent);
            }
        });

    }
}