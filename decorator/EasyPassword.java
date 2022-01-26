package decorator;

import java.util.Random;

public class EasyPassword extends Password {

    private final int MAX_RANDOM_NUMBER = 100; //Added for Magic Number Avoidance
    
    /**
     * Constructs an EastPassword from a String
     * The logic must be done in the constructor method or calling getPassword() in the main driver will concatanate numbers after each call
     * @param phrase
     */
    public EasyPassword(String phrase){
        super(phrase);
        makePass();
    }

    public String getPassword() {
        
        return this.password;
    }

    private void makePass(){
        Random r = new Random();
        
        this.password = (password+r.nextInt(MAX_RANDOM_NUMBER+1)).replaceAll("\\s", "");
    }

}
