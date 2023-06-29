package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sezonButon(View view)
    {
        Intent intent = new Intent(MainActivity.this,SezonlarEkrani.class);
        startActivity(intent);

    }
    public void karakterButon(View view)
    {
        Intent intent = new Intent(MainActivity.this,KarakterlerinEkrani.class);
        startActivity(intent);

    }


}