package iterator;

import java.util.ArrayList;

public class PT {

    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;

    
    private Exercise[] growArray(Exercise[] exercises){
        
        int size = exercises.length + this.exercises.length;

        return new Exercise[size];

    }


    public PT(String firstName, String lastName, String bio){

    }

    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions){

    }

    public String getFirstName(){
        return "";
    }

    public String getLastName(){
        return "";
    }

    public String getBio(){
        return "";
    }

    public ExerciseIterator createIterator(){
        return new ExerciseIterator(this.exercises);
    }

    public String toString(){
        return "";
    }

    
}
