package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }

    public void perro(View view) {
        MediaPlayer ladrido = MediaPlayer.create(Animales.this,R.raw.guau);
        ladrido.start();
    }

    public void gato(View view) {
        MediaPlayer maullido = MediaPlayer.create(Animales.this,R.raw.miau);
        maullido.start();
    }
}