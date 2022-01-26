package decorator;

import java.util.Random;

public class EasyPassword extends Password {

    private static final int MAX_RANDOM_NUMBER = 99;
    private static final int MIN_NUMBER = 1;
    
    /**
     * Constructs an EasyPassword from a String
     * @param phrase
     */
    public EasyPassword(String phrase){
        super(phrase);
    }

    public String getPassword() {
        Random r = new Random();
        
        //This will concatenate a number from the range 1-99
        this.password = (this.password+(r.nextInt(MAX_RANDOM_NUMBER)+MIN_NUMBER)).replaceAll("\\s", "");
        return this.password;
    }

}
