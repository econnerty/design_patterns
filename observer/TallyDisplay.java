package observer;
import java.util.HashMap;

/**
 * TallyDisplay class for displaying results
 * @author Erik Connerty
 */

public class TallyDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes;

    /**
     * Constructor for tally display takes in a poll and registers this instance of observer to the poll
     * @param A subject
     */
    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Sets the hashmap and calls to display to print to the screen
     * @param The hashmap of presidents and votes
     */
    public void update(HashMap<String, Integer> votes){
        this.votes = votes;
        display();
    }

    /**
     * Prints the HashMap to the screen as a tally for each president
     * @param The hashmap to be outputted
     */
    private void display() {

        System.out.println("\nCurrent Tallies:");
        for (String president : votes.keySet()){
            System.out.println(president + ": " + votes.get(president));
        }
    }
}
