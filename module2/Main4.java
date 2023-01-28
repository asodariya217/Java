package Module3;
import java.util.ArrayList;
public class Main4 {
 
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
 
        // Adding elements to the ArrayList
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
 
        // Print the initial list
        System.out.println("Initial list: " + list);
 
        // Reverse the list
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
 
        // Print the reversed list
        System.out.println("Reversed list: " + list);
    }
}