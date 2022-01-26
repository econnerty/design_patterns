package decorator;

import java.util.Random;

public class RandomCasing extends PasswordDecorator{

    //Setting this to will allow us to have a 50% of a upper or lowercase letter because Random will return a 0 or 1
    private static final int MAX_RANDOM_INT = 2;

    public RandomCasing(Password passwordBeginning){

        super(passwordBeginning);
        makePass();
    }

    public String getPassword(){
        return this.password;
    }

    private void makePass(){
        Random r = new Random();

        String out = "";

        for (char a : this.password.toCharArray()){
            if (r.nextInt(MAX_RANDOM_INT) > 0)
                out += Character.toUpperCase(a);
            else
                out += Character.toLowerCase(a);
        }
        this.password = out;
    }
    
}
