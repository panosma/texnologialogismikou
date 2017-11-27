package bestoffer.tl.com.bestoffer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends AppCompatActivity {


    Button buttonRegistration;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        buttonRegistration = findViewById(R.id.buttonRegistration);
        button2 = (Button) findViewById(R.id.button2);
    }

    @Override
    public void onStart() {
        super.onStart();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Welcome_screen.this,LoginActivity.class));
            }
        });



        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Welcome_screen.this, RegistrationActivity.class));
            }
        });
    }
}
