package com.savinci.splashtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation zoom;
    Animation titleAnim;
    ImageView img;
    ImageView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        titleAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.title_anim);

        img = findViewById(R.id.image);
        title = findViewById(R.id.title);

        img.startAnimation(zoom);
        title.startAnimation(titleAnim);



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
                finish();
            }
        },1500);
    }
}