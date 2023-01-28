package Module3;

import java.util.HashSet;

public class HashSet {
  
 public static void main(String[] args) {
  
  // Create a HashSet
  HashSet<String> hset = new HashSet<String>();
  
  //add elements to HashSet
  hset.add("Apple");
  hset.add("Mango");
  hset.add("Grapes");
  hset.add("Orange");
  hset.add("Fig");
  hset.add("Pear");
  
  // Displaying the HashSet 
  System.out.println("HashSet contains: ");
  System.out.println(hset);
  
  // Get the number of elements in the hash set
  int size = hset.size();
  System.out.println("Number of elements in the HashSet: " + size);
 }
}