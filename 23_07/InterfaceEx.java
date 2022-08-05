package a23_7;

interface Print
{
	void print();
}
interface Show
{
	void show();
}
public class InterfaceEx implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing");
	}
	public static void main(String[] args) {
		
		InterfaceEx i1 =new InterfaceEx();
		
		i1.print();
		i1.show();
		
	}
}
