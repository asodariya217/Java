package Module3;

import java.util.ArrayList; 

public class IterateArrayList { 
   public static void main(String[] args) { 

      // Create an ArrayList of String 
      ArrayList<String> animals = new ArrayList<String>(); 
      animals.add("Lion"); 
      animals.add("Tiger"); 
      animals.add("Cat"); 
      animals.add("Dog"); 

      // Iterate through the ArrayList elements 
      System.out.println("ArrayList items: "); 
      for(String animal : animals) { 
         System.out.println(animal); 
      } 
   } 
}