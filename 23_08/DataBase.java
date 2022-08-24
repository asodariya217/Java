package a23_08;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DataBase implements ActionListener
{

	JFrame frame;
	JButton b1,b2,b3,b4,b5;
	
	
	public DataBase() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		b1 =new JButton("Insert");
		b2 =new JButton("Update");
		b3 =new JButton("Delete");
		b4 =new JButton("VIEW");
		
		b1.addActionListener(this);
		
		
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2,BorderLayout.WEST);
		frame.add(b3,BorderLayout.EAST);
		frame.add(b4,BorderLayout.CENTER);
		frame.setSize(500,100);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new DataBase();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Alloperations a = new Alloperations();
		
		if(e.getSource() == b1)
		{
			a.insertdata();
		}
		// TODO Auto-generated method stub
		
	}

}

class Alloperations
{
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton btn1;
	
	
	
	public void insertdata()
	{
		insertframe=new JFrame();
		tf1= new JTextField(10);
	    tf2=new JTextField(10);
		btn1=new JButton("Insert");
		
		btn1.addActionListener(new ActionListener() 
		{
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String host="jdbc:mysql://localhost:3306/";
				String db="test";
				String url=host+db;
				
				String name=tf1.getText().toString();
				String surname=tf2.getText().toString();
				
				try {
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql= "insert into user value(null, '" + name + "','"+surname+"')";
					Statement stmt=(Statement) con.createStatement();
					int status=stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("INSERTED");
					}
					else
					{
						System.out.println("FAIL");
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
		insertframe.setSize(500,500);
		
	
	}
}
