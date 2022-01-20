package observer;
import java.util.HashMap;

/**
 * TallyDisplay class for displaying results
 * @author Erik Connerty
 */

public class TallyDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes; //Is this really necessary? We already pass this to update from our Poll class

    /**
     * Constructor for tally display takes in a poll and registers this instance of observer to the poll
     * @param A subject
     */
    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Prints the HashMap to the screen as a tally for each president
     * @param The hashmap to be outputted
     */
    public void update(HashMap<String, Integer> votes){

        System.out.println("Current Tallies:");
        for (String president : votes.keySet()){
            System.out.println(president + ": " + votes.get(president));
        }
    }
}
