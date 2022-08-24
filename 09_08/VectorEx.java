package a09_08;
import java.util.Vector;

public class VectorEx
{
	public static void main(String[] args) 
	{
		
		Vector v =new Vector<>(5);
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("a");
		v.addElement("d");
		v.addElement("e");
		v.add("c");
		v.add("a");
		v.addElement("d");
		v.addElement("e");
		v.addElement("e");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		if(v.contains("t"))
		{
			System.out.println("called");
		}
		else
		{
			System.out.println("Not Called");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}

}
