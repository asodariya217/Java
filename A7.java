package a23_7;
interface Android
{
	void app();
}
interface Java
{
	void website();
}

public class A7 implements Android,Java
{

	@Override
	public void website() {
		// TODO Auto-generated method stub
		System.out.println("website accessed");
	}

	@Override
	public void app() {
		// TODO Auto-generated method stub
		System.out.println("app accessed");
	}
	
	public static void main(String[] args) {
		
		
		A7 a = new A7();
		a.website();
		a.app(); 
	}

}
