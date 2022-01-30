package decorator;

/**
 * Symbols Class. Replaces chars with Symbols.
 * @author Erik Connerty
 */

public class Symbols extends PasswordDecorator{
    
    /**
     * Constructs a Symbols Decorator with the previous password
     * @param The previous password
     */
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
    }

    /**
     * Replaces predetermined chars with different symbols
     * @returns The modified string
     */
    public String getPassword(){

        //This seems to be simpler. Since uppercase was not specified, I did not add it
        this.password = this.password.replace("a", "@");
        this.password = this.password.replace("b", "8");
        this.password = this.password.replace("e", "3");
        this.password = this.password.replace("g", "9");
        this.password = this.password.replace("i", "!");
        this.password = this.password.replace("o", "0");
        this.password = this.password.replace("s", "$");
        this.password = this.password.replace("t", "7");

        return this.password;
    }

}
