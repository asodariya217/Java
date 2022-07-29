package a23_7;

public class Svm 
{
	int id;
	String name;
	static String college="VVP";
	
	
	
	public Svm(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="Atmiya";
	}
	
	public static void main(String[] args) {
		
		change();
		
		Svm s1 =new Svm(101, "Abhi");
		Svm s2 =new Svm(102, "Gaurang");
		
		s1.display();
		s2.display();
		
		
	}
}
