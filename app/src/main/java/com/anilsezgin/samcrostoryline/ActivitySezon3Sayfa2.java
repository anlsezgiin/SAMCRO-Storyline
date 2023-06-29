package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySezon3Sayfa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sezon3_sayfa2);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivitySezon3Sayfa2.this,ActivitySezon3.class);
        startActivity(intent);
    }
    public void anasayfa(View view){
        Intent intent = new Intent(ActivitySezon3Sayfa2.this,MainActivity.class);
        startActivity(intent);
    }
}