package Module1;

import java.util.Scanner;

public class SumAndEverage
{
	public static void main(String[] args) {

		int n = 0, s = 0;

		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			s += n;
		}
		double avg = s / 5;
		System.out.println("Sum of nubers is " + s + " and the average of numbers " + avg);

	}

}
