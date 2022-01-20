package observer;
import java.util.HashMap;

/**
 * PercentageDisplay class for displaying results
 * @author Erik Connerty
 */


public class PercentageDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes; //Is this really necessary? We already pass this to update from our Poll class

    public PercentageDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes){
        
        float total = 0;

        System.out.println("Current Percent of Votes:");
        for (String president : votes.keySet()){
            total += votes.get(president);
        }

        for (String president : votes.keySet()){
            System.out.println(president + ": " + String.format("%.2f", (votes.get(president)/total)*100) + "%");
        }

    }
    
}
