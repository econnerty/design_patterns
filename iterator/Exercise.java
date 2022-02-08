package iterator;

import java.util.ArrayList;

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

    public void addTargetMuscle(String muscle){
        targetMuscles.add(muscle);
    }

    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }

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
