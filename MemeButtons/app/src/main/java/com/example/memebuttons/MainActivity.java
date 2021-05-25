package com.example.memebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = findViewById(R.id.but1);
        final MediaPlayer sound1 = MediaPlayer.create(this, R.raw.fuckyou);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sound1.start();



                //PROVA COMMENTO 1 ---INCROCIAMO LE DITA

            }
        });




    }
}
