package iterator;

import java.util.ArrayList;

public class PT {


    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises = new Exercise[2];

    
    private Exercise[] growArray(Exercise[] exercises){
        
        int size = exercises.length*2;

        Exercise[] newExercises = new Exercise[size];

        System.arraycopy(exercises, 0, newExercises, 0, this.exercises.length);
        return newExercises;


    }


    public PT(String firstName, String lastName, String bio){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions){

        Exercise newExercise = new Exercise(title, muscleGroups, directions);

        ExerciseIterator iter = createIterator();

        int i = 0;

        while(iter.hasNext()){
            iter.next();
            i++;
        }

        if (i < this.exercises.length) {
            exercises[i] = newExercise;
        }
        else {
            this.exercises = growArray(this.exercises);
            this.exercises[i] = newExercise;
        }


    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getBio(){
        return bio;
    }

    public ExerciseIterator createIterator(){
        return new ExerciseIterator(this.exercises);
    }

    public String toString(){
        return (firstName + " " + lastName + "\n" + bio+ "\n");
    }

    
}
