package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon3);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon3.this,SezonlarEkrani.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon3.this,ActivitySezon3Sayfa2.class);
        startActivity(intent);
    }
}