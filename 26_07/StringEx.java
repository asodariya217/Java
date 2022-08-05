package a26_7;

public class StringEx
{
	public static void main(String[] args) 
	{
		
		//StringBuilder -Immutable
		//StringBuffer -Mutable
		
		/*
		 	Immutable-can not change
		 	mutable- can change
		 */
		
		String s1="TOPS";//literal string
		
		String s2=new String("TOPS");//new keyword string
		
		char ch[]= {'T','O','P','S'};//character array string
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(ch);
		
		
		
	}

}
