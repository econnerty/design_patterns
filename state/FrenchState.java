package state;

import java.util.ArrayList;
import java.util.Arrays;

public class FrenchState implements State {

    private static final String twinkleName = "Brille, brille, petite étoile";
    private static final String happyName = "Si tu as d' la joie au Coeur";

    private static final ArrayList twinkleLyrics = new ArrayList<String>(Arrays.asList("Brille, brille, petite étoile,", "Je me demande vraiment ce que tu es!", "Au-dessus du monde si haut,", "Comme un diamant dans le ciel.","Brille, brille, petite étoile,", "Je me demande vraiment ce que tu es!"));
    private static final ArrayList happyLyrics = new ArrayList<String>(Arrays.asList("Si tu as d' la joie au coeur, Frappe des mains", "Si tu as d' la joie au coeur, Frappe des mains", "Si tu as d' la joie au coeur, Si tu as d' la joie au coeur", "Si tu as d' la joie au coeur, Frappe des mains"));  

    private MusicBox box;

    public FrenchState(MusicBox box){
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
        System.out.println("You are already in French mode");
    }
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
    
}
