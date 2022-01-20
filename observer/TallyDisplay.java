package observer;
import java.util.HashMap;

/**
 * TallyDisplay class for displaying results
 * @author Erik Connerty
 */

public class TallyDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes; //Is this really necessary? We already pass this to update from our Poll class

    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes){

        System.out.println("Current Tallies:");
        for (String president : votes.keySet()){
            System.out.println(president + ": " + votes.get(president));
        }
    }
}
