package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tara);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivityTara.this,KarakterlerinEkrani.class);
        startActivity(intent);
    }
}