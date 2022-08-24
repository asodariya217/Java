package a09_08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx 
{
	public static void main(String[] args) 
	{
		
		HashSet<String>set =new HashSet<>();
		
		set.add("Android");
		set.add("Java");
		set.add("Php");
		set.add("Python");
		set.add("Ios");
		set.add("Ios");
		
		
		Iterator i =set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
