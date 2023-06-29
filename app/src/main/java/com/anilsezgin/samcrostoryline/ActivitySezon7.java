package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon7);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon7.this,SezonlarEkrani.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon7.this,ActivitySezon7Sayfa2.class);
        startActivity(intent);
    }
}