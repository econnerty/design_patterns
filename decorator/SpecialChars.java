package decorator;

import java.util.Random;

public class SpecialChars extends PasswordDecorator{

    //Setting these variables will allow us to check 3/10 times for a 30% rate without using magic numbers
    private static final int PERCENT_OF_TEN = 3;
    private static final int MAX_RANDOM_INT = 10;


    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
        makePass();
    }
    
    public String getPassword(){
        return this.password;

    }

    private void makePass(){

        Random r = new Random();
        String out = "";

        //These are the chars we will add
        char[] specialChars = {'*','!','%','+','.','{','}'}; 

        for (char a : this.password.toCharArray()){
            if (r.nextInt(MAX_RANDOM_INT) < PERCENT_OF_TEN) {
                out += a;
                out += specialChars[r.nextInt(specialChars.length)]; //Picking a random character out of our array
            }
            else
                out += a;
        }

        this.password = out;

    }
}
