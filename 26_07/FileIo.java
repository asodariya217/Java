package a26_7;

import java.io.FileOutputStream;

public class FileIo 
{
	private static FileOutputStream fout;

	public static void main(String[] args) {

		// FileOutputStream - Write
		// FileInputStream - Read

		try 
		{
			String s="welcome to tops";
			fout = new FileOutputStream("E://gaurang.txt");
			fout.write(s.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");

	}

}
