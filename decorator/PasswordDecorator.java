package decorator;

/**
 * PasswordDecorator Class. Serves as abstract class for all decorators
 * @author Erik Connerty
 */

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Constructs a PasswordDecorator with the previous Password as a param
     * @param The password to be decorated
     */
    public PasswordDecorator(Password passwordBeginning){

        //super(passwordBeginning.password);
        this.passwordBeginning = passwordBeginning;
        this.password = passwordBeginning.password;

    }

    /**
     * Returns the password
     * @return The password
     */
    public abstract String getPassword();/*{
        return this.password;
    }*/
}
