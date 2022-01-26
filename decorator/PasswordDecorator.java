package decorator;

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning){
        
        super(passwordBeginning.getPassword());
        this.passwordBeginning = passwordBeginning;

    }

    public String getPassword(){
        return this.passwordBeginning.getPassword();
    }
}
