
public class Max
{
	public static void main(String[] args)
	{
		int num1 = 8;
		int num2 = 9;
		int num3 = 10;

		if (num1 > num2)
	    {
	        if (num1 > num3)
	        {
	            System.out.println("number 1 is largest" + num1);
	        }
	        else
	        {
	            System.out.println("number 3 is largest" + num3);
	        }
	    }
	    else if (num2 > num3)
	    {
	    	 System.out.println("number 2 is largest" + num2);
	    }
	    else
	    {
	    	 System.out.println("number 3 is largest" + num3);
	    }
	 }
}
