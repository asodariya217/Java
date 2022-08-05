package a30_7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstApp 
{
	
		JFrame frame;
		JButton btn;
		JLabel l1;
		
	
	public MyFirstApp() 
	{
		// TODO Auto-generated constructor stub
		
			frame=new JFrame("Tops App");
			
		//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			btn=new JButton("Click Me");
			btn.setBounds(182, 42, 109, 23);	
			
			l1 =new JLabel("Welcome to Tops");
			l1.setBounds(185, 11, 100, 14);
			
			frame.add(l1);
			frame.add(btn);
			frame.setSize(500,500);
			frame.setLayout(null);
			frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new MyFirstApp();
	}
}