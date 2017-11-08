package myapp.baz.com.katerina;

/**
 * Created by kater on 08/11/2017.
 */

public class Shops {

    private String Name;
    private String Email;
    private String Password;

    public Shops(String Name,String Email,String Password){
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
