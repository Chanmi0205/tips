package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guitar extends AppCompatActivity {

    private Button guitar_go;
    private Button lavel;
    private Button laver;
    private Button perfume;
    private Button rice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);

        rice = findViewById(R.id.rice);
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( guitar.this , rice.class);
                startActivity(intent);
            }
        });

        perfume = findViewById(R.id.perfume);
        perfume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( guitar.this , perfume.class);
                startActivity(intent);
            }
        });

        laver = findViewById(R.id.laver);
        laver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( guitar.this , laver.class);
                startActivity(intent);
            }
        });

        lavel = findViewById(R.id.lavel);
        lavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (guitar.this , label.class);
                startActivity(intent);
            }
        });

        guitar_go = findViewById(R.id.guitar_go);
        guitar_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}