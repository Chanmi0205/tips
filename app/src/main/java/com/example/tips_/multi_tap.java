package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multi_tap extends AppCompatActivity {

    private Button multi_tap_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_tap);

        multi_tap_go = findViewById(R.id.multi_tap_go);
        multi_tap_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (multi_tap.this , removal.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });


    }
}