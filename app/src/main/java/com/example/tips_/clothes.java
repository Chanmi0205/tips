package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clothes extends AppCompatActivity {

    private Button clothes_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        clothes_go = findViewById(R.id.clothes_go);
        clothes_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (clothes.this , laundry.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });


    }
}