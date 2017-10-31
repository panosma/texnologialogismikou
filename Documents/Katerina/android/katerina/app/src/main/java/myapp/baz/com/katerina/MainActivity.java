package myapp.baz.com.katerina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView mListaTextView;
    Button mButtonEpitheto;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mListaRef = mRootRef.child("Epitheto");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListaTextView = (TextView)findViewById(R.id.textViewLista);
        mButtonEpitheto = (Button)findViewById(R.id.buttonEpitheto);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mListaRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mListaTextView.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mButtonEpitheto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListaRef.setValue("Baz");
            }
        });

    }
}
