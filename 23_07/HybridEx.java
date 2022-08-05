package a23_7;

class P1
{
	void p1()
	{
		System.out.println("p1 accessed");
	}
}
class Q1 extends P1
{
	void q1()
	{
		System.out.println("q1 accessed");
	}
}
interface R1
{
	void r1();
	
}
class S1 extends Q1 implements R1
{
	void s1()
	{
		System.out.println("s1 accessed");
	}

	@Override
	public void r1() 
	{
		// TODO Auto-generated method stub
		System.out.println("r1 accessed");
	}
}

public class HybridEx 
{

	public static void main(String[] args) {
		
		S1 s =new S1();
		
		s.p1();
		s.q1();
		s.r1();
		s.s1();
	}

}
