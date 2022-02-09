package iterator;

import java.util.ArrayList;

/**
 * Exercise Class
 * @author Erik Connerty
 */
public class PT {


    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises = new Exercise[2];

    
    
    /** 
     * @param exercises
     * @return Exercise[]
     */
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

    
    /** 
     * @param title
     * @param muscleGroups
     * @param directions
     */
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

    
    /** 
     * @return String
     */
    public String getFirstName(){
        return firstName;
    }

    
    /** 
     * @return String
     */
    public String getLastName(){
        return lastName;
    }

    
    /** 
     * @return String
     */
    public String getBio(){
        return bio;
    }

    
    /** 
     * @return ExerciseIterator
     */
    public ExerciseIterator createIterator(){
        return new ExerciseIterator(this.exercises);
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return (firstName + " " + lastName + "\n" + bio+ "\n");
    }

    
}
