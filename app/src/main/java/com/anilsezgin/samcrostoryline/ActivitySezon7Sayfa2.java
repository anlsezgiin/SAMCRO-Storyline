package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon7Sayfa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon7_sayfa2);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon7Sayfa2.this,ActivitySezon7.class);
        startActivity(intent);
    }
    public void anasayfa(View view){
        Intent intent = new Intent(ActivitySezon7Sayfa2.this,MainActivity.class);
        startActivity(intent);
    }
}