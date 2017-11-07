package com.bestoffer.tl.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop_info extends AppCompatActivity {

    Button mButtonnext4;
    Button mButtonprev2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_info);
        mButtonnext4 = (Button) findViewById(R.id.buttonnext4);
        mButtonprev2 = (Button) findViewById(R.id.buttonprev2);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Shop_info.this, Shop_adding.class));
            }
        });

        mButtonprev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Shop_info.this, Result_list.class));
            }
        });

    }

}
