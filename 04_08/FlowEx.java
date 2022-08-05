package a04_08;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowEx 
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public FlowEx() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		btn1=new JButton("OK");
		btn2=new JButton("CANCEL");
		btn4=new JButton("ERROR");
		btn3=new JButton("SAVEEEEEEEEEEEEE");
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn4);
		frame.add(btn3);
		
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		
		new FlowEx();
	}
}
