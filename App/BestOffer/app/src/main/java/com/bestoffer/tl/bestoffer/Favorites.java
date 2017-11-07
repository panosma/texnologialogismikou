package com.bestoffer.tl.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Favorites extends AppCompatActivity {

    Button mButtonprev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        mButtonprev = (Button) findViewById(R.id.buttonprev);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Favorites.this, Shop_adding.class));
            }
        });
    }
}
