package a23_7;

import java.util.*;
class Member
{
	String name;
	String number;
	int amount;
	
}

 class Sub extends Member 
{
	Scanner sc = new Scanner(System.in);
	
	public void staff()
	{
		System.out.println("Enter your Name: ");
		name = sc.nextLine();
		System.out.println("Enter your Number: ");
		number = sc.nextLine();
		System.out.println("Enter your Amount: ");
		amount = sc.nextInt();
		
		int total = amount - 50;
		System.out.println("You have to pay: " + total);
	}
	
	public void other()
	{
		System.out.println("Enter your Name: ");
		name = sc.nextLine();
		System.out.println("Enter your Number: ");
		number = sc.nextLine();
		System.out.println("Enter your Amount: ");
		amount = sc.nextInt();
		
		System.out.println("you have to pay: " + amount);
	}
}

public class Discount
{
	public static void main(String[] args) 
	{
		
		Sub c1 = new Sub();
		
		
		c1.other();
		
		
	}
	

}
