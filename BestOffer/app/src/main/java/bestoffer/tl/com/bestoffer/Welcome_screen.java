package bestoffer.tl.com.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends AppCompatActivity {

    Button mButtonSign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        mButtonSign_up = (Button) findViewById(R.id.Sign_up);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonSign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Welcome_screen.this, Sign_up.class));
            }
        });
    }
}
