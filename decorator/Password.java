package decorator;


public abstract class Password {
    protected String password;

    public Password(String phrase){
        this.password = phrase;
    }

    public String getPassword() {
        return this.password;
    }
}
