package decorator;

import java.util.Random;

public class RandomCasing extends PasswordDecorator{

    //Setting this to will allow us to have a 50% of a upper or lowercase letter because Random will return a 0 or 1
    private static final int MAX_RANDOM_INT = 2;

    /**
     * Constructs a RandomCasing Decorator with the previous password
     * @param The previous password
     */
    public RandomCasing(Password passwordBeginning){

        super(passwordBeginning);
    }

    /**
     * There is a 50% the letter will be made uppercase or lowercase
     * @returns The modified string
     */
    public String getPassword(){
        Random r = new Random();

        String out = "";

        for (char a : this.password.toCharArray()){
            if (r.nextInt(MAX_RANDOM_INT) > 0)
                out += Character.toUpperCase(a);
            else
                out += Character.toLowerCase(a);
        }
        this.password = out;
        return this.password;
    }

    
}
