package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry extends AppCompatActivity {

    private Button laundry_go;
    private Button wardrobe;
    private Button clothes;
    private Button towel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);

        towel = findViewById(R.id.towel);
        towel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(laundry.this , towel.class);
                startActivity(intent);
            }
        });

        clothes = findViewById(R.id.clothes);
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(laundry.this , clothes.class);
                startActivity(intent);
            }
        });

        wardrobe = findViewById(R.id.wardrobe);
        wardrobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(laundry.this, wardrobe.class);  // 옷장 화면으로 이동
                startActivity(intent);
            }
        });

        laundry_go = findViewById(R.id.laundry_go);
        laundry_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}