package Module1;

import java.util.Scanner;


public class InputString
{

	public static void main(String[] args) {

		String input = "Hi my name is gaurang , 123";
		count(input);

	}

	public static void count(String s) {

		char[] c = s.toCharArray();
		int letter = 0;
		int number = 0;
		int spaces = 0;
		int other = 0;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(c[i])) {
				letter++;
			} else if (Character.isSpace(c[i])) {
				spaces++;
			} else if (Character.isDigit(c[i])) {
				number++;
			} else {
				other++;
			}

		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + spaces);
		System.out.println("number: " + number);
		System.out.println("other: " + other);

	}
}
