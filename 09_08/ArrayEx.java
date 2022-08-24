package a09_08;

public class ArrayEx 
{
	public static void main(String[] args) 
	{
		
		/*Array:collection of similar items
		
		
		types of array
		1)single dimesional array
		2)MultiDimensional array
		[]
		[][]		*/
		
		
		//int marks[5]= {1,2,3,4,5};//c
		
		int marks[]=new int[5];
		
		int marks2[]= {10,20,30,40,50};
		
		marks[0]=55;
		marks[1]=65;
		marks[2]=75;
		marks[3]=85;
		marks[4]=95;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("--------------------------------");
		
		for(int j=0;j<5;j++)
		{
			System.out.println(marks2[j]);
		}
		
	}

}
