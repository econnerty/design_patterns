package state;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Erik Connerty
 * EnglishState Interface
 * Implements an English state with song lyrics in English
 */
public class EnglishState implements State {

    //Songs names
    private static final String twinkleName = "Twinkle Twinkle Little Star";
    private static final String happyName = "If you're happy and you know it";

    //Lyrics for the two songs
    private static final ArrayList twinkleLyrics = new ArrayList<String>(Arrays.asList("Twinkle, twinkle, little star,", "How I wonder what you are!", "Up above the world so high,", "Like a diamond in the sky.,","Twinkle, twinkle, little star,", "How I wonder what you are!"));
    private static final ArrayList happyLyrics = new ArrayList<String>(Arrays.asList("If you're happy and you know it clap your hands", "If you're happy and you know it clap your hands", "If you're happy and you know it clap your hands and you really want to show it", "If you're happy and you know it clap your hands"));  

    private MusicBox box;

    /**
     * Constructor for EnglishState
     * @param A MusicBox instance
     */
    public EnglishState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton() throws InterruptedException {
        box.playSong(twinkleName, twinkleLyrics);
    }
    public void pressHappyButton() throws InterruptedException {
        box.playSong(happyName, happyLyrics);
    }
    public void pressEnglishButton(){
        System.out.println("You are already in English mode");
    }
    public void pressFrenchButton(){
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
    
}
