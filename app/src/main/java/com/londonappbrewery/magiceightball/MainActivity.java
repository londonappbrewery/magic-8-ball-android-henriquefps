package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.id.button_ask;
import static com.londonappbrewery.magiceightball.R.id.imageview_magic_ball;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = (Button) findViewById(R.id.button_ask);

        final ImageView ballImage;
        ballImage = (ImageView) findViewById(imageview_magic_ball);

        final int[] respostas = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Random rand = new Random();


        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 0;
                value = rand.nextInt(5);

                ballImage.setImageResource(respostas[value]);

            }
        });

    }
}
