package decorator;

import java.util.Map;

public class Symbols extends PasswordDecorator{
    
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
    }

    public String getPassword(){
        String out = "";

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
        return this.password;
    }

}
