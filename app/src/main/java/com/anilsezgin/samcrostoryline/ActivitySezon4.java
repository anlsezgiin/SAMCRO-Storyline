package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon4);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon4.this,SezonlarEkrani.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon4.this,ActivitySezon4Sayfa2.class);
        startActivity(intent);
    }
}