package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon2);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon2.this,SezonlarEkrani.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon2.this,ActivitySezon2Sayfa2.class);
        startActivity(intent);
    }
}