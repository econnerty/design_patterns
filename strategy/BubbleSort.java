package strategy;
import java.util.ArrayList;

public class BubbleSort implements SortBehavior {

    public ArrayList<String> sort(ArrayList<String> data){ 

        //Referenced from https://www.javatpoint.com/bubble-sort-in-java
        for(int i=0; i < data.size(); i++){  
            for(int j=1; j < (data.size()-i); j++){  
                if(data.get(j-1).compareToIgnoreCase(data.get(j)) >= 0){  //checks if the starting char at j-1 is larger than the char at j
                     String temp = data.get(j-1);  
                     data.set(j-1, data.get(j));  
                     data.set(j, temp);  
                     }  
                          
                }  
         }
         return data; 
    }
    
}
