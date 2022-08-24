package a18_08;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx 
{
	
	JFrame frame;
	
	
	public GridLayoutEx() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		    JButton b1=new JButton("1");  
		    JButton b2=new JButton("2");  
		    JButton b3=new JButton("3");  
		    JButton b4=new JButton("4");  
		    JButton b5=new JButton("5");  
		    JButton b6=new JButton("6");  
		    JButton b7=new JButton("7");  
		    JButton b8=new JButton("8");  
		    JButton b9=new JButton("9");  
		
		    
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.setSize(250,250);
		frame.setLayout(new GridLayout(3,3));
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new GridLayoutEx();
	}
}