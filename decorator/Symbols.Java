package decorator;

import java.util.Map;

public class Symbols extends PasswordDecorator{
    
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
        makePass();
    }

    public String getPassword(){
        return this.password;
    }

    private void makePass(){

        String out = "";

        System.out.println("Symbols: " + this.password);

        for (char a : this.password.toCharArray()){
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
        }

        this.password = out;

    }
}
