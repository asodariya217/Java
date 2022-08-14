package Module1;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year: ");
		int year = sc.nextInt();

		if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {

			System.out.println("Entered year is a Leap year");
			
		}
		else {
			System.out.println("Entered year is not Leap year");
		}

	}

}
