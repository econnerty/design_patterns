package iterator;

import java.util.ArrayList;

/**
 * PT Class
 * @author Erik Connerty
 */
public class PT {

    private static final int ARRAY_SIZE = 2;

    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises = new Exercise[ARRAY_SIZE];

    public PT(String firstName, String lastName, String bio){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }
    
    /** 
     * Adds an Exercise with the parameters
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
     * Get the first name
     * @return String
     */
    public String getFirstName(){
        return firstName;
    }
    
    /** 
     * Gets the last name
     * @return String
     */
    public String getLastName(){
        return lastName;
    }
    
    /** 
     * Gets the bio
     * @return String
     */
    public String getBio(){
        return bio;
    }

    /** 
     * Returns an iterator for Exercises
     * @return ExerciseIterator
     */
    public ExerciseIterator createIterator(){
        return new ExerciseIterator(this.exercises);
    }

    /** 
     * Returns a string of the PT info
     * @return String
     */
    public String toString(){
        return (firstName + " " + lastName + "\n" + bio+ "\n");
    }
  
    /** 
     * Doubles the arrays length and puts the old data into the new one
     * @param exercises
     * @return Exercise[]
     */
    private Exercise[] growArray(Exercise[] exercises){
        
        int size = exercises.length*2;

        Exercise[] newExercises = new Exercise[size];

        System.arraycopy(exercises, 0, newExercises, 0, this.exercises.length);
        return newExercises;


    }

    
}
