package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class removal extends AppCompatActivity {

    private Button bottle;
    private Button go;
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
                Intent intent = new Intent(removal.this , tape.class); // 테이프 화면으로 이동
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

        go = findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(removal.this , learn.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });


        bottle = findViewById(R.id.bottle);
        bottle.setOnClickListener(new View.OnClickListener() {
            class Intnet extends Intent {
                public Intnet(removal removal, Class<bottle> bottleClass) {
                }
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intnet(removal.this , bottle.class);  // B를 눌렀을 때 나타나는 화면으로 이동
                startActivity(intent);
            }
        });

    }
}