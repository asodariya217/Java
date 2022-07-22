package July21;

public class ParaEx 
{
	//global
		int id;
		String name;

		public ParaEx(int id,String name) 
		{//local
			// TODO Auto-generated constructor stub

			this.id=id;
			this.name=name;
		}

		void display()
		{
			System.out.println(id+" "+name);
		}
		public static void main(String[] args) 
		{
			ParaEx p1 =new ParaEx(101, "Gaurang");
			ParaEx p2 =new ParaEx(102, "Abhi");

			p1.display();
			p2.display();

			/*System.out.println(p1.id+" "+p1.name);
			System.out.println(p2.id+" "+p2.name);
			*/


		}

}
