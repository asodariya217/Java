package a23_7;

public class Triangle 
{
	
	float a ;
	float b ;
	float c ;
	
	public Triangle() 
	{
		
		
	}
	
	public void perimeter()
	{
		float perimeter = a + b + c;
		System.out.println("The perimeter of the triangle is: " + perimeter);
	}

		public static void main(String[] args) 
		{
			
			Triangle t1 = new Triangle();
			t1.a = 3;
			t1.b = 4;
			t1.c = 5;
			
			t1.perimeter();
			
		}
}