package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class german_cockroach extends AppCompatActivity {

    private Button german_cockroach_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_cockroach);

        german_cockroach_go = findViewById(R.id.german_cockroach_go);
        german_cockroach_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}