package bestoffer.tl.com.bestoffer;

/**
 * Created by kater on 13/11/2017.
 */

public class Shops {

    private String  mEmailView;
    private String mPasswordView;


    public Shops(String Email,String Password){
        this. mEmailView = Email;
        this.mPasswordView = Password;
    }

    public String getEmail() {
        return  mEmailView;
    }

    public void setEmail(String email) {
        mEmailView = email;
    }

    public String getPassword() {
        return mPasswordView;
    }

    public void setPassword(String password) {
        mPasswordView = password;
    }
}
