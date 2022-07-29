package a28_7;

//Method Having a same name but number of parameters are diffrent

public class OverloadingEx 
{
	static int cal(int a,int b)
	{
		return a+b;
	}
	static double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(cal(5.6, 6.6));
		System.out.println(cal(5, 6));
	}
}