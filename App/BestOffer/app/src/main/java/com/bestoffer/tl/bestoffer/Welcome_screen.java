package com.bestoffer.tl.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends AppCompatActivity {

    Button mButtonnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        mButtonnext = (Button) findViewById(R.id.buttonnext);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Welcome_screen.this,Home_screen.class));
            }
        });
    }
}