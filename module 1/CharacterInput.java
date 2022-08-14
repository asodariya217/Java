package Module1;

import java.util.Scanner;

public class CharacterInput
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String s = sc.next();
		boolean vowels = s.equals("a") || s.equals("e") || 
				s.equals("i") || s.equals("o") || s.equals("u");
		
		if(s.length()>1) {
			System.out.println("Error! Please Enter a single character");
		}
		
		else if(vowels) {
			System.out.println("Entered character is vowel");
		}
		
		else {
			System.out.println("Entered character is consatant");
		}
	}

}
