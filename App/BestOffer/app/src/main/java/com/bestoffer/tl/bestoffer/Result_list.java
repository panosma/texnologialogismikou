package com.bestoffer.tl.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Result_list extends AppCompatActivity {

    Button mButtonnext3;
    Button mButtonprev3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_list);
        mButtonnext3 = (Button) findViewById(R.id.buttonnext3);
        mButtonprev3 = (Button) findViewById(R.id.buttonprev3);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Result_list.this, Shop_info.class));
            }
        });

        mButtonprev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Result_list.this, Home_screen.class));
            }
        });
    }
}
