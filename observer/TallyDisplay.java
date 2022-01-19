package observer;
import java.util.HashMap;

/**
 * TallyDisplay class for displaying results
 * @author Erik Connerty
 */

public class TallyDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes; //Is this really necessary?

    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes){
        
    }
}
