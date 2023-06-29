package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon2Sayfa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon2_sayfa2);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon2Sayfa2.this,ActivitySezon2.class);
        startActivity(intent);
    }
    public void sonrakiSayfa(View view){
        Intent intent = new Intent(ActivitySezon2Sayfa2.this,ActivitySezon2Sayfa3.class);
        startActivity(intent);
    }
}