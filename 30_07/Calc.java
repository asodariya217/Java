package a30_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calc implements ActionListener
{
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3;
	JButton btnadd,btnminus;
	
	
	public Calc() 
	{
		// TODO Auto-generated constructor stub
		
		frame=new JFrame("Calculator App");
		
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		tf1=new JTextField();
		tf1.setBounds(197, 11, 100, 20);
		tf2=new JTextField();
		tf2.setBounds(197, 51, 100, 20);
		tf3=new JTextField();
		tf3.setBounds(197, 91, 100, 20);
		l1=new JLabel("Enter Number 1");
		l1.setBounds(90, 11, 96, 14);
		l2=new JLabel("Enter Number 2");
		l2.setBounds(90, 51, 96, 14);
		
		tf3.setEditable(false);
		
		btnadd=new JButton("+");
		btnadd.setBounds(197, 136, 46, 38);
		
		btnminus=new JButton("-");
		btnminus.setBounds(257, 136, 46, 38);
		
		btnadd.addActionListener(this);
		btnminus.addActionListener(this);
		
		
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btnadd);
		frame.add(btnminus);
		frame.setSize(500,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Calc();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		String a=tf1.getText().toString();
		String b=tf2.getText().toString();
		int c=0;
		// TODO Auto-generated method stub
		if(e.getSource()==btnadd)
		{
			c=Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btnminus)
		{
			c=Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		tf3.setText(String.valueOf(c));
	}
}