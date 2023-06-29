package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon6Sayfa5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon6_sayfa5);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon6Sayfa5.this,ActivitySezon6Sayfa4.class);
        startActivity(intent);
    }
    public void anasayfa(View view) {
        Intent intent = new Intent(ActivitySezon6Sayfa5.this, MainActivity.class);
        startActivity(intent);
    }
}