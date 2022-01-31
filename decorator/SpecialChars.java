package decorator;

import java.util.Random;

/**
 * SpecialChars class. Will insert random special chars 30% of the time after each char in a String
 * @author Erik Connerty
 */

public class SpecialChars extends PasswordDecorator{

    //Setting these variables will allow us to check 3/10 times for a 30% rate without using magic numbers
    private static final int PERCENT_OF_TEN = 3;
    private static final int MAX_RANDOM_INT = 10;

   /**
     * Constructs a SpecialChars Decorator with the previous password
     * @param The previous password
     */
    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
    }
    
    /**
     * Will insert a random special char 30% of the time for each char in the string
     * @returns The modified string
     */
    public String getPassword(){
        Random r = new Random();
        String out = "";

        //These are the chars we will add
        char[] specialChars = {'*','!','%','+','.','{','}'}; 

        for (char a : this.password.toCharArray()){
            if (r.nextInt(MAX_RANDOM_INT) < PERCENT_OF_TEN) {
                out += a;
                out += specialChars[r.nextInt(specialChars.length)]; //Picking a random character out of our array
            }
            else {
                out += a;
            }
        }

        this.password = out;
        return this.password;

    }

   
    
}
