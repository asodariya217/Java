package a13_08;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashsetDemoEx 
{
	public static void main(String[] args) 
	{
		
	/*	LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add("TOPS");
		lhs.add('H');
		lhs.add(10);
		// insertion order is not maintain in set
		//but its LinkedHasSet 
		//so insertion order is maintain
		System.out.println(lhs);
		*/
		
		TreeSet t1 = new TreeSet<>();
		t1.add(10);
		t1.add(90);
		t1.add(20);
		//t1.add("Hello");
		System.out.println(t1);
	}
}