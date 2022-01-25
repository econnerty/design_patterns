package decorator;

import java.util.Random;

public class EasyPassword extends Password {

    private final int MAX_RANDOM_NUMBER = 100; //Added for Magic Number Avoidance
    
    public EasyPassword(String phrase){
        super(phrase);
    }

    public String getPassword() {
        
        Random r = new Random();
        this.password = (this.password+r.nextInt(MAX_RANDOM_NUMBER+1)).replaceAll("\\s", "");
        return this.password;

}
