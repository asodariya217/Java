package a13_08;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int sid;
	String sname;
	
	
	public Student(int id,String name) 
	{
		sid=id;
		sname=name;
	}

	@Override
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
			
		
		
		int value=0;
		
		if(this.sid>o.sid) 
		{
			return 1;
		}
		else if (this.sid<o.sid) 
		{
			return -1;
		}
		else if(this.sid==o.sid)
		{
			return 0;
		}
		
		return value;
		
		
		
		
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) 
	{
		Student s1 =new Student(101,"Abhi");
		Student s2 =new Student(103,"Vishal");
		Student s3 =new Student(102,"Gaurang");

		ArrayList<Student> al =new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		
		for(Student s:al)
		{
			System.out.println(s.sid+" "+s.sname);
		}
		
	}
}