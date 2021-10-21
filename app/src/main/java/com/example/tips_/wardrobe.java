package com.example.tips_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wardrobe extends AppCompatActivity {

    private Button wardrobe_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wardrobe);

        wardrobe_go = findViewById(R.id.wardrobe_go);
        wardrobe_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (wardrobe.this , laundry.class);  // 전 화면으로 이동
                startActivity(intent);
            }
        });


    }
}