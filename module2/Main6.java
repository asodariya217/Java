package Module3;

import java.util.HashMap; 

public class Main6 { 
    public static void main(String[] args) { 
        // create a HashMap 
        HashMap<Integer,String> map = new HashMap<Integer,String>(); 
          
        // check if map is empty 
        System.out.println("Is map empty? "+map.isEmpty()); 
          
        // add elements to the map 
        map.put(1, "One"); 
        map.put(2, "Two"); 
          
        // check if map is empty 
        System.out.println("Is map empty? "+map.isEmpty()); 
    } 
}
