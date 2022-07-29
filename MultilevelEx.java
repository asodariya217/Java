package a23_7;

class A1
{
	void a1()
	{
		System.out.println("data accessed from a1");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("data accessed from b1");
	}
}
class C1 extends B1
{
	void c1()
	{
		System.out.println("data accessed from c1");
	}
}
class D1 extends C1
{
		void d1()
		{
			System.out.println("data accessed from d1");
		}
}
public class MultilevelEx 
{
	public static void main(String[] args) {
		
		D1 d =new D1();
		
		d.a1();
		d.b1();
		d.c1();
		d.d1();
		
	}

}
