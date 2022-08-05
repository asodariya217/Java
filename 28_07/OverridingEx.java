package a28_7;

class Bank
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends Bank
{
	int rate()
	{
		return 7;
	}
}
class Icici extends Bank
{
	int rate()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx 
{
	public static void main(String[] args) 
	{
		
		Bank b;
		
		b=new Sbi();
		System.out.println(b.rate());
		b=new Icici();
		System.out.println(b.rate());
		b=new Axis();
		System.out.println(b.rate());
			
		
	}
}