package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityClay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clay);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivityClay.this,KarakterlerinEkrani.class);
        startActivity(intent);
    }
}