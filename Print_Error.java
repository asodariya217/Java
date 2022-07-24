package assignment;

import java.util.*;

public class Print_Error
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please Provide single character from the alphabet: ");
        String letter = scan.next();
        
        if (scan.hasNext())
        {
            letter = letter.toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
            {
                System.out.println("Vowel");
            }
            else if (letter.length() > 1)
            {
                System.out.println("Error");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("Error");
        }
    }

}
