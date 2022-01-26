package decorator;


public abstract class Password {
    protected String password;

    /**
     * Constructs a password from a phrase
     * @param The password phrase to start with
     */
    public Password(String phrase){
        this.password = phrase;
    }

    /**
     * Returns the password
     * @return The password
     */
    public String getPassword() {
        return this.password;
    }
}
