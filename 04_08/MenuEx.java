package a04_08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuEx implements ActionListener
{
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu File,Edit,Help,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	JTextArea tarea;
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame=new JFrame();
		
		menuBar=new JMenuBar();
		
		File=new JMenu("FILE");
		Edit=new JMenu("EDIT");
		Help=new JMenu("HELP");
		tarea=new JTextArea();
		tarea.setBounds(56, 41, 350, 310);
		submenu=new JMenu("Submenu");
				
		i1=new JMenuItem("Cut");
		i2=new JMenuItem("Copy");
		i3=new JMenuItem("Paste");
		i4=new JMenuItem("Select All");
		
		
		Help.add(submenu);
		submenu.add(i1);
		
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		
		Edit.add(i1);
		Edit.add(i2);
		Edit.add(i3);
		Edit.add(i4);
		
		File.add(submenu);
		
		
		submenu.add(i4); 
		submenu.add(i2);
		menuBar.add(File);
		
		menuBar.add(Edit);
		menuBar.add(Help);
		  
		
		
		
		frame.add(tarea);
		frame.setJMenuBar(menuBar);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MenuEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==i1)
		{
			tarea.cut();
		}
		if(e.getSource()==i2)
		{
			tarea.copy();
		}
		if(e.getSource()==i3)
		{
			tarea.paste();
		}
		if(e.getSource()==i4)
		{
			tarea.selectAll();
		}
		if(e.getSource()==i5)
		{
			
		}
	}
}