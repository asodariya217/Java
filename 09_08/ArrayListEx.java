package a09_08;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("Android");
		arrayList.add("Java");
		arrayList.add("Php");
		
		arrayList.add("Java");
		arrayList.add("Php");
		
		ArrayList<String>arrayList2 = new ArrayList<>();
		arrayList2.add("Ios");
		arrayList2.add("Python");
		arrayList2.add("Java");
		arrayList2.add("Php");
		
		
		/*arrayList.addAll(arrayList2);
		
		arrayList.remove(1);
		arrayList.remove("Python");
		arrayList.removeAll(arrayList2);*/
		
		//arrayList.retainAll(arrayList2);
		
		Iterator<String>
		i = arrayList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
