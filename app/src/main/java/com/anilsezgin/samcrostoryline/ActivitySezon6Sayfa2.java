package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon6Sayfa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon6_sayfa2);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon6Sayfa2.this,ActivitySezon6.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon6Sayfa2.this,ActivitySezon6Sayfa3.class);
        startActivity(intent);
    }
}