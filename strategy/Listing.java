package strategy;
import java.util.ArrayList;

public class Listing {
    private String title;
    private ArrayList<String> items = new ArrayList<String>();
    private SortBehavior sortBehavior = new BubbleSort(); 
    
    public Listing(String title) {
        this.title = title;
    }

    public void add(String item) {
        items.add(item);
        }

    public void remove(String item){
        int i = 0;
        for (String out : items) {
            if (out == item)
                items.remove(i);
            i++;
        }
    }
    public String getTitle(){
        return title;
    }
    public ArrayList<String> getSortedList(){
        return sortBehavior.sort(items);
    }
    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }


}
