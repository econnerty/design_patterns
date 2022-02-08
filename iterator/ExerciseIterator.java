package iterator;

import java.util.Iterator;

public class ExerciseIterator implements Iterator {

    private Exercise[] exercises;
    private int position;

    //Referenced from https://github.com/portiaportia/DesignPatterns/blob/master/src/csce247/iterator/DinerMenuIterator.java
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
