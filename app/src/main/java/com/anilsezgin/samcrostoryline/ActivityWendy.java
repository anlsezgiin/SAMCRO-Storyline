package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityWendy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wendy);
    }
    public void öncekiSayfa(View view)
    {
        Intent intent = new Intent(ActivityWendy.this,KarakterlerinEkrani.class);
        startActivity(intent);
    }
}