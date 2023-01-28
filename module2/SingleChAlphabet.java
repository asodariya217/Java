package Module3;
	import java.util.Scanner;

	public class SingleChAlphabet 
	{
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a letter: ");
	        String letter = input.nextLine();

	        if (letter.length() == 1) 
	        {
	            char ch = letter.charAt(0);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	            {
	                System.out.println("Vowel");
	            } 
	            else 
	            {
	                System.out.println("Consonant");
	            }
	        } 
	        else 
	        {
	            System.out.println("Error! You must enter a single character!");
	        }
	    }
	}
