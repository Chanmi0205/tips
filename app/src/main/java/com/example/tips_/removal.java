package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class removal extends AppCompatActivity {

    private Button bottle;
    private Button removal_go;
    private Button multi_tap;
    private Button tree;
    private Button tape;
    private Button tonic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_removal);

        tonic = findViewById(R.id.tonic);
        tonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(removal.this , tonic.class); // 영양제 화면으로 이동
                startActivity(intent);
            }
        });

       tape = findViewById(R.id.tape);
       tape.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(removal.this , tape.class);  // 테이프 화면으로 이동
               startActivity(intent);
           }
       });

        tree = findViewById(R.id.tree);
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(removal.this , tree.class);  // 나무 화면으로 이동
                startActivity(intent);
            }
        });

        multi_tap = findViewById(R.id.multi_tap);
        multi_tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(removal.this , multi_tap.class); // 멀티탭 화면으로 이동
                startActivity(intent);
            }
        });

        removal_go = findViewById(R.id.removal_go);
        removal_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();          // 전 화면으로 이동
            }
        });

        bottle = findViewById(R.id.bottle);
        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(removal.this , bottle.class);  // 폐트병 화면으로 이동
                startActivity(intent);
            }
        });

    }
}