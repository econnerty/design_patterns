package strategy;
import java.util.ArrayList;

/**
 * Listing class
 * @author Erik Connerty
 */

public class Listing {
    
    private String title;
    private ArrayList<String> items = new ArrayList<String>();
    private SortBehavior sortBehavior = new BubbleSort(); 
    
    public Listing(String title) {
        this.title = title;
    }

    /**
     * Adds a string to the Listing
     * @param The string to be removed the list
     */
    public void add(String item) {
        items.add(item);
        }
    
    /**
     * Removes a string from the listing if it is present in the ArrayList
     * @param The string to be removed the list
     */
    public void remove(String item){
        int i = 0;
        for (String out : items) {
            if (out == item)
                items.remove(i);
            i++;
        }
    }

    /**
     * Returns the title of listing
     * @return title
     */
    public String getTitle(){
        return title;
    }
    /**
     * Calls the sorting function and returns a sorted ArrayList
     * @return Sorted ArrayList
     */
    public ArrayList<String> getSortedList(){
        return sortBehavior.sort(items);
    }

    /**
     * Sets the sort behavior
     * @param sortBehavior is a class either BubbleSort() or InsertionSort()
     */
    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }


}
