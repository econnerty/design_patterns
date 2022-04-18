package state;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @author Erik Connerty
 * Music Box Class
 * Provides abstraction for a music box and keeps tracks of all different states. Able to play back a song in different languages.
 */
public class MusicBox {

    //Instance Variables
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * MusicBox constructor. Initializes all the states and sets the Music Box to start in English
     */
    public MusicBox() {
        System.out.println("Creating Our Music Box");
        System.out.println("Starting up the Music Box");

        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    /**
     * Presses the star button for the current state IE plays Twinkle Twinkle Little Star
     * @throws InterruptedException
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Presses the Happy button for the current state IE plays If you're happy and you know it.
     * @throws InterruptedException
     */
    public void pressHappyButton(){
        state.pressHappyButton();
    }

    /**
     * Switches Language to English if not already in it
     */
    public void pressEnglishButton(){
        state.pressEnglishButton();
    }
    /**
     * Switches Language to French if not already in it
     */
    public void pressFrenchButton(){
        state.pressFrenchButton();
    }
     /**
     * Switches Language to Spanish if not already in it
     */
    public void pressSpanishButton(){
        state.pressSpanishButton();
    }

    /**
     * Set the state to this
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }

    //Accessors
    public State getEnglishState() {
        return this.englishState;
    }

    public State getFrenchState() {
        return this.frenchState;
    }

    public State getSpanishState() {
        return this.spanishState;
    }

    /**
     * Plays the song back line by line with a 1.5 second delay between each line. Displays song name first
     * @param songName
     * @param lyrics
     */
    public void playSong(String songName, ArrayList<String> lyrics){

        System.out.println("\nPlaying: " + songName);

        for(String temp : lyrics) {
            System.out.println(temp);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println();
        
    }
}
