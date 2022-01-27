package decorator;

import java.util.Random;

/**
 * EasyPassword Class. Adds random number from 1-99 to a password.
 * @author Erik Connerty
 */

public class EasyPassword extends Password {

    //Inclusive Constants for random number generator
    private static final int MAX_RANDOM_NUMBER = 99;
    private static final int MIN_RANDOM_NUMBER = 1;
    
    /**
     * Constructs an EasyPassword from a String
     * @param A string to be made into a password
     */
    public EasyPassword(String phrase){
        super(phrase);
    }

    /**
     * Adds a random number from 1-99 to the end of the password
     * @return The modified password
     */
    public String getPassword() {
        Random r = new Random();
        
        //Getting the number
        int randomNumber = r.nextInt((MAX_RANDOM_NUMBER+1)-MIN_RANDOM_NUMBER)+MIN_RANDOM_NUMBER;

        //This will concatenate a number from the range 1-99 and remove whitespace
        this.password = (this.password+randomNumber).replaceAll("\\s", "");
        return this.password;
    }

}
