package a13_08;

	enum student2
	{
		John(11), Bella(10), Sam(13), Viraaj(9);
		
		int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		private student2(int age)
		{
			// TODO Auto-generated constructor stub
			this.age=age;
		}
		
		
		
	}
	public class Abc 
	{
		public static void main(String[] args) 
		{
			System.out.println(student2.Bella.age);
		}
	}

