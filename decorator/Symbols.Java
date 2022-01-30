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
        //this.password = passwordBeginning.password;
    }

    /**
     * Replaces predetermined chars with different symbols
     * @returns The modified string
     */
    public String getPassword(){

        //This seems to be simpler
        this.password = this.password.replace("a", "@");
        this.password = this.password.replace("b", "8");
        this.password = this.password.replace("e", "3");
        this.password = this.password.replace("g", "9");
        this.password = this.password.replace("i", "!");
        this.password = this.password.replace("o", "0");
        this.password = this.password.replace("s", "$");
        this.password = this.password.replace("t", "7");

        /*String out = "";

        for (char a : this.password.toCharArray()){

            //Make sure the char is lowercase
            a = Character.toLowerCase(a);

            switch (a) {
                case 'a':
                    out += '@';
                    break;
                case 'b':
                    out += '8';
                    break;
                case 'e':
                    out += '3';
                    break;
                case 'g':
                    out += '9';
                    break;
                case 'i':
                    out += '!';
                    break;
                case 'o':
                    out += '0';
                    break;
                case 's':
                    out += '$';
                    break;
                case 't':
                    out += '7';
                    break;
                default:
                    out += a;
                    break;
            }
        }*/

        //this.password = out;
        return this.password;
    }

}
