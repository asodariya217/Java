package a02_8;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckboxEx implements ItemListener
{
	JFrame frame;
	JCheckBox chk1,chk2;
	
	public CheckboxEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame= new JFrame();
		
		
		chk1=new JCheckBox("JAVA");
		chk1.setBounds(176, 7, 97, 23);
		
		chk2=new JCheckBox("Android");
		chk2.setBounds(176, 46, 97, 23);
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		
		
		
		frame.add(chk1);
		frame.add(chk2);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CheckboxEx();
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==chk1)
		{
			//JOptionPane.showMessageDialog(frame, "You are selected Java");
			
			System.out.println("JAVA");
			
		}
		if(e.getSource()==chk2)
		{
			//JOptionPane.showMessageDialog(frame, "You are selected Android");
			System.out.println("ANDROID");
		}
	}
	
}