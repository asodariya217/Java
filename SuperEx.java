package a23_7;

class M1
{
	String color="white";
}
class N1 extends M1
{
	String color="black";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperEx 
{
	public static void main(String[] args) {
		
		N1 n =new N1();
		n.display();
	}
}