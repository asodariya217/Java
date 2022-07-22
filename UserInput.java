package July21;

public class UserInput
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter Your Id");
		int id=sc.nextInt();

		System.out.println("Enter Your Name");
		String name=sc.next();

		System.out.println("Enter Your Salary");
		double salary =sc.nextDouble();

		System.out.println(id+" "+name+" "+salary);

		if(salary>=35000)
		{
			System.out.println("It's Good");
		}
		else
		{
			System.out.println("You need to increase your income");
		}

	}
}