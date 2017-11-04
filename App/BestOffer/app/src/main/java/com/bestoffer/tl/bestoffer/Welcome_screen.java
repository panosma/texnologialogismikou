package com.bestoffer.tl.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends AppCompatActivity {

    Button mButtonbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    mButtonbutton2 = (Button) findViewById(R.id.button2);

    Button.OnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View.v) {
            startActivity(new Intent(Welcome_screen.this, Home_screen.class));
                                            }
    })
};






//    Button.setOnClickListener(new View.OnClickListener() {
//        @Override
//                public void onClick(View.v) {
//                startActivitie(new Intent(Welcome_screen.this, Home_screen.class));
//        }
//    });



