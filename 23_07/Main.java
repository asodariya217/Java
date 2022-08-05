package a23_7;

class father
{
	public void name() 
	{
		System.out.println("I am Parent");
	}
	
}
class child extends father
{
	public void print() 
	{
		System.out.println("I am child");
	}
}

public class Main 
{
	public static void main(String[] args)
	{
		father f1 = new father();
		child c1 = new child();
		
		f1.name();
		c1.print();
		c1.name();
	}
}