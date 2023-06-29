package com.anilsezgin.samcrostoryline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SezonlarEkrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezonlar_ekrani);
    }

    public void geriDön(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void gitSezon1(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon1.class);
        startActivity(intent);
    }

    public void gitSezon2(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon2.class);
        startActivity(intent);
    }

    public void gitSezon3(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon3.class);
        startActivity(intent);
    }

    public void gitSezon4(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon4.class);
        startActivity(intent);
    }

    public void gitSezon5(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon5.class);
        startActivity(intent);
    }

    public void gitSezon6(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon6.class);
        startActivity(intent);
    }

    public void gitSezon7(View view) {
        Intent intent = new Intent(SezonlarEkrani.this, ActivitySezon7.class);
        startActivity(intent);
    }
}