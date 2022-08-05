package a26_7;

public class TryCatchEx
{

	public static void main(String[] args) 
	{
		try
		{
			int data=10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("success");
		
	}

}
