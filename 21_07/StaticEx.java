package July21;

public class StaticEx
{
	static int count=0;

	public StaticEx()
	{
		// TODO Auto-generated constructor stub

		count++;
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		StaticEx s1 =new StaticEx();
		StaticEx s2 =new StaticEx();
		StaticEx s3 =new StaticEx();
		StaticEx s4 =new StaticEx();
		StaticEx s5 =new StaticEx();
	}
}

