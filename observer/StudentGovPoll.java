package observer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Student Government Poll Class
 * @author Erik Connerty
 */

public class StudentGovPoll implements Subject {

    private static final int UPDATES_BEFORE_NOTIFY = 4; //I added this to avoid using a magic number in enterVotes

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates = 0; //we keep track of each time the hash map is changed so that we can notify the observers once every 4 times

    /**
     * Constructor takes in a name for the school
     * @param The school's name
     */
    public StudentGovPoll(String school) {
        this.school = school;
    }

    /**
     * Adds the observers to an ArrayList so that they can be notified later
     * @param An observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the ArrayList
     * @param The observer to be removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Iterates through the registered observers and calls their update function
     */
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(votes);
        }
    }

    /**
     * Adds a candidate to the HashMap so their votes can be counted
     * @param The president's name
     */
    public void addCandidate(String president) {
        votes.put(president, 0); //we start with zero votes
    }

    /**
     * Puts votes in for the given president and updates the numUpdates counter to notify observers. If we have reached 4 updates, we will notify observers.
     * @param The President's name
     * @param The number of votes for that president
     */
    public void enterVotes(String president, int num) {
        votes.put(president,(votes.get(president) + num));
        numUpdates++;
        if (numUpdates % UPDATES_BEFORE_NOTIFY == 0)
            notifyObservers();
    }

    /**
     * Returns the school's name
     * @return The school's name
     */
    public String getSchool() {
        return this.school;
    }

}