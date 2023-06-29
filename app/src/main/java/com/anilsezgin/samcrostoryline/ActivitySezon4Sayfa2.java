package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon4Sayfa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon4_sayfa2);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon4Sayfa2.this,ActivitySezon4.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon4Sayfa2.this,ActivitySezon4Sayfa3.class);
        startActivity(intent);
    }
}