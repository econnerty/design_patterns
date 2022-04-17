package state;

/**
 * @author Erik Connerty
 * State Interface
 * Provides interface for the difference states
 */
public interface State {

    /**
     * Tells the music box to play twinkle twinkle little star in the given language
     * @throws InterruptedException
     */
    public void pressStarButton() throws InterruptedException;

    /**
     * Tells the music box to play If you're happy and you know it in the given language
     * @throws InterruptedException
     */
    public void pressHappyButton() throws InterruptedException;

    /**
     * Changes the state to English if it isn't already in it
     */
    public void pressEnglishButton();

    /**
     * Changes the state to French if it isn't already in it
     */
    public void pressFrenchButton();

    /**
     * Changes the state to Spanish if it isn't already in it
     */
    public void pressSpanishButton();
    
}
