package iterator;

import java.util.Iterator;

public class ExerciseIterator implements Iterator {

    private Exercise[] exercises;
    private int position;

    //https://stackoverflow.com/questions/25433379/default-iterator-implementation-for-array-of-object-t
    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    }

    public boolean hasNext(){
        return ((position < exercises.length) && (exercises[position] != null));
    }

    public Exercise next(){
        if (hasNext()){
            return exercises[position++];
        }
        return null;

    }
    
}
