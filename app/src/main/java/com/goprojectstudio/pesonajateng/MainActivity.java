package com.goprojectstudio.pesonajateng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menjalankan splash activity dlm beberapa detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //apa yg terjadi
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                //splash screen hilang
                finish();
            }
        },4000);
    }
}
