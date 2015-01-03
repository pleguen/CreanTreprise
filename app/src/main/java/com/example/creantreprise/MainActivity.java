package com.example.creantreprise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean check = false;
        ImageView logo = (ImageView) findViewById(R.id.logoentreprise);
        final Button quitter = (Button) findViewById(R.id.quitterbouton);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        logo.startAnimation(fadeInAnimation);


        // Bouton quitter
        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animAlpha);
                view.setVisibility(View.INVISIBLE);
                // Fini le process
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });


    }


}

