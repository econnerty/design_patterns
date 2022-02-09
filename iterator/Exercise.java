package iterator;

import java.util.ArrayList;

/**
 * Exercise Class
 * @author Erik Connerty
 */
public class Exercise {
    
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    public Exercise(String title){
        this.title = title;
        targetMuscles = new ArrayList<String>();
        directions = new ArrayList<String>();

    }

    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
        
    }

    
    /** 
     * Adds a target muscle
     * @param The muscle
     */
    public void addTargetMuscle(String muscle){
        targetMuscles.add(muscle);
    }

    
    /** 
     * Removes a target muscle
     * @param muscle
     */
    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }

    
    /** 
     * Returns a string
     * @return The string
     */
    public String toString(){
        String out = "\n... "+ title + " ...";


        out += "\nMuscles: ";
        for (String targetM : targetMuscles){
            out += targetM + ", ";
        }

        out += "Directions:\n";

        for(String direction : directions){
            out += "- "+direction + "\n";
        }

        return out;

    }

}
