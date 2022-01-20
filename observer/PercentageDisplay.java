package observer;
import java.util.HashMap;

/**
 * PercentageDisplay class for displaying results
 * @author Erik Connerty
 */


public class PercentageDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes; //Is this really necessary? We already pass this to update from our Poll class

       /**
     * Constructor for percentage display takes in a poll and registers this instance of observer to the poll
     * @param A subject
     */
    public PercentageDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Prints the HashMap to the screen as percentage for each president
     * @param The hashmap to be outputted
     */
    public void update(HashMap<String, Integer> votes){
        
        //we use a float here so java will automatically keep the output as a float later
        float total = 0;

        System.out.println("Current Percent of Votes:");
        for (String president : votes.keySet())
            total += votes.get(president);

        for (String president : votes.keySet())
            System.out.println(president + ": " + String.format("%.1f", (votes.get(president)/total)* 100) + "%");

    }
    
}
