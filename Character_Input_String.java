package assignment;

import java.util.*;

public class Character_Input_String
{
	  Scanner input=new Scanner(System.in);
	  System.out.print("Enter A String: ");
	  String str=input.nextLine();
	      int letter=0,space=0,digit=0,other=0;
	    char ch[]=str.toCharArray();
	 for(int i=0;i<str.length();i++)
	 {
	    if(Character.isLetter(ch[i]))
	    {
	        letter++;
	    }
	    else if(Character.isDigit(ch[i]))
	    {
	       digit++;
	    }
	    else if(Character.isSpaceChar(ch[i]))
	            {
	         space++;
	      }
	      else{
	       other++;
	       }
	       }
	 System.out.println("Letter are: "+letter);
	 System.out.println("Space are: "+space);
	 System.out.println("Digit are: "+digit);
	 System.out.println("Other: "+other);      
	 }


}
