package observer;
import java.util.HashMap;

/**
 * TallyDisplay class for displaying results
 * @author Erik Connerty
 */

public class TallyDisplay implements Observer {

    private Subject poll;

    public TallyDisplay(Subject poll){
        this.poll = poll;
    }

    public void update(HashMap<String, Integer> votes){

    }
}
