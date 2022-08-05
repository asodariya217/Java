package a28_7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization 
{
	public static void main(String[] args) 
	{
		try 
		{
			Student s1 =new Student(101, "Gaurang");
			FileOutputStream fout = new FileOutputStream("E://abhi.txt");
			ObjectOutputStream out =new ObjectOutputStream(fout);
			out.writeObject(s1);
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
	}
}