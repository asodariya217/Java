package a23_7;

class A
{
	void a()
	{
		System.out.println("Data accessed from A");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("Data accessed from B");
	}
}


public class SingleEx
{
	public static void main(String[] args) 
	{
		
		B b =new B();
		
		b.a();
		b.b();
	}

}
