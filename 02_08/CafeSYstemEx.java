package a02_8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CafeSYstemEx 
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JLabel l1;
	JButton btn1;
	
	public CafeSYstemEx()
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		l1=new JLabel("Cafe Ordering System");
		l1.setBounds(163, 11, 150, 14);
		
		chk1=new JCheckBox("Pizza @ rs.100");
		chk1.setBounds(166, 31, 150, 23);
		
		chk2=new JCheckBox("Burger @rs.70");
		chk2.setBounds(166, 61, 150, 23);

		chk3=new JCheckBox("Coffee @rs.120");
		chk3.setBounds(166, 91, 150, 23);
		
		btn1=new JButton("SUBMIT");
		btn1.setBounds(174, 133, 89, 23);
		
		btn1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
			
				// TODO Auto-generated method stub
				
					int amount=0;
					
					StringBuilder builder=new StringBuilder("\n selected Items \n");
					
					if(chk1.isSelected())
					{
						amount+=100;
						builder.append("\n Pizza @ rs.100 \n");
					}
					
					if(chk2.isSelected())
					{
						amount+=70;
						builder.append("\n Burger @ rs.70 \n");
					}
					
					if(chk3.isSelected())
					{
						amount+=120;
						builder.append("\n Coffee @ rs.120 \n");
					}
					builder.append("-----------------------------");
					builder.append("\n Total:"+amount);
					
					JOptionPane.showMessageDialog(frame,builder.toString());
			}
		});
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn1);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CafeSYstemEx();
	}
}