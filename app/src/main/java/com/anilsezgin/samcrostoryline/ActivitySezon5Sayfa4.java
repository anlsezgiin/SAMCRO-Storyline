package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon5Sayfa4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon5_sayfa4);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon5Sayfa4.this,ActivitySezon5Sayfa3.class);
        startActivity(intent);
    }
    public void anasayfa(View view) {
        Intent intent = new Intent(ActivitySezon5Sayfa4.this, MainActivity.class);
        startActivity(intent);
    }

}