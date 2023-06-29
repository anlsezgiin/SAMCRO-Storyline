package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon1);
    }
    public void sonrakiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon1.this,ActivitySezon1Sayfa2.class);
        startActivity(intent);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon1.this,SezonlarEkrani.class);
        startActivity(intent);
    }
}