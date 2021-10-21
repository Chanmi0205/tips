package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learn extends AppCompatActivity {

    private Button removal;
    private Button go;
    private Button cleaning;
    private Button laundry;
    private Button worm;
    private Button guitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        guitar = findViewById(R.id.guitar);
        guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn.this , guitar.class); // 기타 화면으로 이동
                startActivity(intent);
            }
        });

        worm = findViewById(R.id.worm);
        worm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn.this , worm.class); // 해충 박멸 화면으로 이동
                startActivity(intent);
            }
        });

        laundry = findViewById(R.id.laundry);
        laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn.this , laundry.class);  // 빨래 화면으로 이동
                startActivity(intent);
            }
        });

        cleaning = findViewById(R.id.cleaning);
        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn.this , cleaning.class); // 청소 화면으로 이동
                startActivity(intent);
            }
        });

        go = findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            class main {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn.this , main.class); // 메인화면 이동
                startActivity(intent);
            }
        });

        removal = findViewById(R.id.removal);
        removal.setOnClickListener(new View.OnClickListener() {
            class removal {
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn.this , removal.class);  // 분리수거 화면 이동
                startActivity(intent);
            }
        });
    }
}