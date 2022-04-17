package state;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MusicBox {

    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox() {
        System.out.println("Creating Our Music Box");
        System.out.println("Starting up the Music Box");

        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    public void pressStarButton() throws InterruptedException{
        state.pressStarButton();
    }
    public void pressHappyButton() throws InterruptedException{
        state.pressHappyButton();
    }
    public void pressEnglishButton(){
        state.pressEnglishButton();
    }
    public void pressFrenchButton(){
        state.pressFrenchButton();
    }
    public void pressSpanishButton(){
        state.pressSpanishButton();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getEnglishState() {
        return this.englishState;
    }

    public State getFrenchState() {
        return this.frenchState;
    }

    public State getSpanishState() {
        return this.spanishState;
    }

    public void playSong(String songName, ArrayList<String> lyrics) throws InterruptedException{

        System.out.println("\nPlaying: " + songName);

        for(String temp : lyrics) {
            System.out.println(temp);
            Thread.sleep(1500);
        }
        System.out.println();
        
    }
}
