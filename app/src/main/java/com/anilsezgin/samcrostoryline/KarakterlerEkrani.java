package com.anilsezgin.samcrostoryline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KarakterlerEkrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakterler_ekrani);

    }
    public void geriDön(View view)
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    public void button1(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityBobby.class);
        startActivity(intent);
    }
    public void button2(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityChibs.class);
        startActivity(intent);
    }
    public void button3(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityClay.class);
        startActivity(intent);
    }
    public void button4(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityGemma.class);
        startActivity(intent);
    }
    public void button5(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityHappy.class);
        startActivity(intent);
    }
    public void button6(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityJax.class);
        startActivity(intent);
    }
    public void button7(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityJuicy.class);
        startActivity(intent);
    }
    public void button8(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityOpie.class);
        startActivity(intent);
    }
    public void button9(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityPiney.class);
        startActivity(intent);
    }
    public void button10(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityTara.class);
        startActivity(intent);
    }
    public void button11(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityTig.class);
        startActivity(intent);
    }
    public void button12(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityUnser.class);
        startActivity(intent);
    }
    public void button13(View view)
    {
        Intent intent = new Intent(KarakterlerEkrani.this,ActivityWendy.class);
        startActivity(intent);
    }

}