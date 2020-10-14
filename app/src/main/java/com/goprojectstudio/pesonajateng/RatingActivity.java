package com.goprojectstudio.pesonajateng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    ImageButton btn_bayar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        btn_bayar = findViewById(R.id.btn_bayar);
        btn_bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RatingActivity.this, "Berhasil!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
