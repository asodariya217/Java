package a16_08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

public class Test implements ActionListener
{
	JFrame frame;
	JButton btninsert,btnview,btnupdate,btndelete;
	
	public Test() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		btninsert = new JButton("INSERT");
		btnview = new JButton("VIEW");
		btnupdate = new JButton("UPDATE");
		btndelete = new JButton("DELETE");
	
		btninsert.addActionListener(this);
		
		frame.add(btninsert);
		frame.add(btnview);
		frame.add(btnupdate);
		frame.add(btndelete);
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Test();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Alloperations a =new Alloperations();
		// TODO Auto-generated method stub
		if(e.getSource()==btninsert)
		{
			a.insertdata();
		}
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
		
		tf1=new JTextField(10);
		tf2=new JTextField(10
				);
		
		btn1=new JButton("INSERT");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String host="jdbc:mysql://localhost:3306/";
				String db="prakruti";
				String url=host+db;
				
				String name=tf1.getText().toString();
				String surname=tf2.getText().toString();
				
				
				
				try 
				{
					Connection con = DriverManager.getConnection(url,"root","");
					String sql= "insert into register value(null, '" + name + "','"+surname+"')";
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
				}
				catch (SQLException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	
}