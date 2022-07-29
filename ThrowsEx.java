package a28_7;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("m");
	}
}
class N extends M
{
	void n() throws IOException
	{
		m();
		System.out.println("n");
	}
}
class P extends N
{
	void p()
	{
		try 
		{
			n();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("executed");
		}
	}
}

public class ThrowsEx 
{
	public static void main(String[] args) throws IOException {
		
		P p1 =new P();
		
		p1.m();
		p1.n();
		p1.p();
		
		
	}
}