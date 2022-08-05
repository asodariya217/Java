package a04_08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEx 
{
	JFrame frame;
	JTable tb;
	String data[][]={ 
			
			{"101","Amit","670000"},    
            {"102","Jai","780000"},    
            {"101","Sachin","700000"}
            
            };  
	  String column[]={"ID","NAME","SALARY"};        
	
	public TableEx() 
	{
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		tb=new JTable(data,column);
		tb.setBounds(30,40,200,300);
		JScrollPane pane=new JScrollPane(tb);
		
		frame.add(pane);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new TableEx();
	}
}