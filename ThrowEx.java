package a28_7;

public class ThrowEx 
{
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("welcome to vote");
		}
		else
		{
			throw new ArithmeticException("Not Valid");
		}
	}
	
	public static void main(String[] args)
	{
		validate(15);
	}
}
