package Module3;

import java.util.ArrayList;
public class RetrieveElement 
{

	    public static void main(String[] args)
	    {
	        ArrayList<String> colors = new ArrayList<String>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Pink");
	        colors.add("Orange");
	        
	        System.out.println("Element at index 3: " + colors.get(3));
	    }
}