package iterator;

public class ExerciseIterator {

    private Exercise[] exercises;
    private int position;

    public ExerciseIterator(Exercise[] exercises){

    }

    public boolean hasNext(){
        return true;
    }

    public Exercise next(){
        return new Exercise("");
    }
    
}
