package decorator;

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning){

        super(passwordBeginning.password);
        this.passwordBeginning = passwordBeginning;

    }

    public String getPassword(){
        return this.password;
    }
}
