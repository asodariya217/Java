package a02_8;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmEx implements WindowListener
{
	JFrame frame;
	
	
	public ConfirmEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(this);
		
			
		
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		
		new ConfirmEx();
		
	}

	@Override
	public void windowActivated(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
			int a=JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit");
			
			if(a==JOptionPane.YES_OPTION)
			{
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
