package bestoffer.tl.com.bestoffer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    EditText txtEmailLogin;
    EditText txtPasswordLogin;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    Button ButtonLogin;
    Button ButtonLogout;
    Button ButtonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmailLogin = findViewById(R.id.txtEmailLogin);
        txtPasswordLogin = findViewById(R.id.txtPasswordLogin);
        firebaseAuth = FirebaseAuth.getInstance();

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user!=null){
                    Log.d(TAG, "sign in" + user.getUid());
                    toastMessage("Successfully signed in with:" + user.getEmail());
                }else{
                    Log.w(TAG, "sign out");
                    toastMessage("Successfully signed out");
                }

            }
        };

        ButtonLogin = findViewById(R.id.btnLoginUser);
        ButtonLogout = findViewById(R.id.btnLogoutUser);
        ButtonInfo = findViewById(R.id.btnAddInfo);




        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmailLogin.getText().toString();
                String pwd = txtPasswordLogin.getText().toString();

                if(!email.equals("") && !pwd.equals("")){
                    firebaseAuth.signInWithEmailAndPassword(email,pwd);
                }else{
                    toastMessage("You didn't fill in all the fields!");
                }

            }
        });

        ButtonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                toastMessage("Signing out...");
            }
        });

        ButtonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,Sign_up.class);
                startActivity(intent);
            }
        });
    } //Toast.makeText(LoginActivity.this, "You didn't fill in all the fields!", Toast.LENGTH_LONG).show();

    private void toastMessage(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        firebaseAuth.addAuthStateListener(mAuthStateListener);
    }
    public void onStop() {
        super.onStop();
        if (mAuthStateListener != null) {
            firebaseAuth.removeAuthStateListener(mAuthStateListener);
        }
    }
}
