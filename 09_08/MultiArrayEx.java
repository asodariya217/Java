package a09_08;

public class MultiArrayEx
{
	public static void main(String[] args) 
	{
		
		int marks[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(marks[i][j]);
			}
			System.out.println();
		}
		
	}

}
