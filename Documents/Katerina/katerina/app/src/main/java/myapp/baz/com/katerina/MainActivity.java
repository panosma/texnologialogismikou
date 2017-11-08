package myapp.baz.com.katerina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Email;
    EditText Password;
    Button SignUp;

    private DatabaseReference mFirebaseDatabaseReference;
    public static final String USERS = "Users";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.EditTextName);
        Email = (EditText)findViewById(R.id.EditTextEmail);
        Password = (EditText)findViewById(R.id.EditTextPassword);
        SignUp = (Button)findViewById(R.id.ButtonSingUp);


        mFirebaseDatabaseReference = FirebaseDatabase.getInstance().getReference();

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shops shops = new Shops(Name.getText().toString(),Email.getText().toString(),Password.getText().toString());
                mFirebaseDatabaseReference.child("Users").push().setValue(shops);
            }
        });

    }

}