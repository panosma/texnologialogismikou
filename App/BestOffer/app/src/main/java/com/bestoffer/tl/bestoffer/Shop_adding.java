package com.bestoffer.tl.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop_adding extends AppCompatActivity {

    Button mButtonnext5;
    Button mButtonprev1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_adding);
        mButtonnext5 = (Button) findViewById(R.id.buttonnext5);
        mButtonprev1 = (Button) findViewById(R.id.buttonprev1);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonnext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Shop_adding.this, Favorites.class));
            }
        });

        mButtonprev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Shop_adding.this, Shop_info.class));
            }
        });

        }
    }

