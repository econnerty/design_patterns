package observer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Student Government Poll Class
 * @author Erik Connerty
 */

public class StudentGovPoll implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates = 0;

    public StudentGovPoll(String school) {
        this.school = school;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(){
        numUpdates++;
    }

    public void addCandidate(String president) {
        votes.put(president, 0);
    }

    public void enterVotes(String president, int num) {
        votes.put(president,(votes.get(president) + num));
    }

    public String getSchool() {
        return this.school;
    }

}