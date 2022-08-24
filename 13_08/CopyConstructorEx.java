package a13_08;

public class CopyConstructorEx 
{
	int id;
	String name;
	
	public CopyConstructorEx(int id,String name)
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	public CopyConstructorEx(CopyConstructorEx s) 
	{
		// TODO Auto-generated constructor stub
		id = s.id;
		name = s.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		CopyConstructorEx s1 = new CopyConstructorEx(8,"Sunit Jha");
		CopyConstructorEx s2 = new CopyConstructorEx(s1);
	
		
		s1.display();
		s2.display();
		
	}
	
	
}