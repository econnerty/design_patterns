package observer;
import java.util.HashMap;
/**
 * Interface for Observer
 * @author Erik Connerty
 */

public interface Observer {

    public void update(HashMap<String, Integer> votes);
    
}