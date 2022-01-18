package strategy;
import java.util.ArrayList;

public class InsertionSort implements SortBehavior{

    public ArrayList<String> sort(ArrayList<String> data){

        //Referenced from https://stackabuse.com/insertion-sort-in-java/
        for (int j = 1; j < data.size(); j++) {
            String temp = data.get(j);
            int i = j-1;
            while ((i > -1) && (data.get(i).compareToIgnoreCase(temp) >= 0)) {
                data.set(i+1, data.get(i));
                i--;
            }
            data.set(i+1, temp);
        }
        return data;
    }
}
