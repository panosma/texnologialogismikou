package myapp.baz.com.katerina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText EditTextLast_name;
    Button ButtonLast_name;

    EditText EditTextName;
    Button ButtonName;

    EditText EditTextEmail;
    Button ButtonEmail;

    DatabaseReference lastnameRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference Last_nameRef = lastnameRef.child("Last Name");

    DatabaseReference nameRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference NameRef = nameRef.child("Name");

    DatabaseReference emailRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference EmailRef = emailRef.child("Email");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonLast_name = (Button) findViewById(R.id.buttonLast_name);
        EditTextLast_name = (EditText) findViewById(R.id.editTextlast_name);


        ButtonName = (Button) findViewById(R.id.buttonName);
        EditTextName = (EditText) findViewById(R.id.editTextName);

        ButtonEmail = (Button) findViewById(R.id.buttonEmail);
        EditTextEmail = (EditText) findViewById(R.id.editTextEmail);


        ButtonLast_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String last_name = EditTextLast_name.getText().toString();
                Last_nameRef.setValue(last_name);
            }
        });

        ButtonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = EditTextName.getText().toString();
                NameRef.setValue(name);
            }
        });

        ButtonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = EditTextEmail.getText().toString();
                EmailRef.setValue(email);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Last_nameRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String last_name = EditTextLast_name.getText().toString();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        NameRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = EditTextName.getText().toString();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        EmailRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String email = EditTextEmail.getText().toString();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}