package iterator;

import java.util.Iterator;

/**
 * Exercise Iterator
 * @author Erik Connerty
 */
public class ExerciseIterator implements Iterator<Exercise> {

    private Exercise[] exercises;
    private int position;

    //Referenced from https://github.com/portiaportia/DesignPatterns/blob/master/src/csce247/iterator/DinerMenuIterator.java
    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    }

    
    /** 
     * Implements iterator.hasNext()
     * @return boolean
     */
    public boolean hasNext(){
        return ((position < exercises.length) && (exercises[position] != null));
    }

    
    /** 
     * Implements iterator.next()
     * @return An Exercise
     */
    public Exercise next(){
        if (hasNext()){
            return exercises[position++];
        }
        return null;

    }
    
}
