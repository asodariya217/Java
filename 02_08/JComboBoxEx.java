package a02_8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEx implements ActionListener
{
	JFrame frame;
	JComboBox<String>cb;
	String city[]= {"Rajkot","Ahmedabad","Surat"};
	
	public JComboBoxEx() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		cb=new JComboBox<>(city);
		cb.setBounds(210, 11, 100, 20);
		
		cb.addActionListener(this);
		
		
		frame.add(cb);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new JComboBoxEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cb)
		{
			System.out.println(cb.getItemAt(cb.getSelectedIndex()));
		}
	}
}