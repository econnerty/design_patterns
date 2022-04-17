package state;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Erik Connerty
 * SpanishState Interface
 * Implements a spanish state with song lyrics in spanish
 */
public class SpanishState implements State {

    //Songa Names
    private static final String twinkleName = "Estrellita, ¿dónde estás?";
    private static final String happyName = "Si usted esta feliz";

    //Lyrics for the two songs
    private static final ArrayList twinkleLyrics = new ArrayList<String>(Arrays.asList("Estrellita, ¿dónde estás?", "Quiero verte cintilar", "En el cielo, sobre el mar.", "Un diamante de verdad.","Estrellita, ¿dónde estás?", "Quiero verte cintilar."));
    private static final ArrayList happyLyrics = new ArrayList<String>(Arrays.asList("Si usted esta feliz Apaluda las fuerte.", "Si usted esta feliz Apaluda las fuerte", "Si usted esta feliz, En su cara se vera. ", "Si usted esta feliz Apaluda las fuerte."));  

    private MusicBox box;

    /**
     * Constructor for SpanishState
     * @param A MusicBox instance
     */
    public SpanishState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton() throws InterruptedException {
        box.playSong(twinkleName, twinkleLyrics);
    }
    public void pressHappyButton() throws InterruptedException {
        box.playSong(happyName, happyLyrics);
    }
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    public void pressFrenchButton(){
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("You are already in Spanish mode");
    }
    
}
