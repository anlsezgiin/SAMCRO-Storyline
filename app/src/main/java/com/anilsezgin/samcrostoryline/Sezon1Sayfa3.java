package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sezon1Sayfa3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon1_sayfa3);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(Sezon1Sayfa3.this,ActivitySezon1Sayfa2.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(Sezon1Sayfa3.this,ActivitySezon1Sayfa4.class);
        startActivity(intent);
    }
}