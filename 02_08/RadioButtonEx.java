package a02_8;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx implements ItemListener
{
	JFrame frame;
	JRadioButton rb1,rb2;
	
	
	public RadioButtonEx() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		
		rb1=new JRadioButton("MALE");
		rb1.setBounds(176, 7, 97, 23);
		
		rb2=new JRadioButton("FEMALE");
		rb2.setBounds(176, 46, 97, 23);
		
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new RadioButtonEx();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			System.out.println("MALE");
		}
		else if(e.getSource()==rb2)
		{
			System.out.println("FEMALE");
		}
	}
}