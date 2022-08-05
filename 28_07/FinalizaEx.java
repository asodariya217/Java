package a28_7;

public class FinalizaEx 
{

	@Override
	protected void finalize() throws Throwable 
	{
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Garbage Collection executed");
	}
	
	public static void main(String[] args) 
	{
		
		FinalizeEx f1=new FinalizeEx();
		FinalizeEx f2=new FinalizeEx();
		FinalizeEx f3=new FinalizeEx();

		f1=null;
		f2=null;
		f3=null;
		
		System.gc();
	}
}

