package observer;
import java.util.HashMap;

/**
 * PercentageDisplay class for displaying results
 * @author Erik Connerty
 */


public class PercentageDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes; //Is this really necessary?

    public PercentageDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes){

    }
    
}
