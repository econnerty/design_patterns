package observer;
import java.util.HashMap;

/**
 * PercentageDisplay class for displaying results
 * @author Erik Connerty
 */


public class PercentageDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes;

    public PercentageDisplay(Subject poll){
        this.poll = poll;
    }

    public void update(HashMap<String, Integer> votes){

    }
    
}
