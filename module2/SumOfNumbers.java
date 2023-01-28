package Module3;

import java.util.Scanner;

public class SumOfNumbers {

	 public static void main(String[] args) {

	  int n, sum = 0;
	  float average;

	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the number of elements you want to enter: ");
	  n = scanner.nextInt();

	  int[] numbers = new int[n];
	  System.out.println("Enter " + n + " numbers: ");

	  for (int i = 0; i < n; i++) {
	   numbers[i] = scanner.nextInt();
	   sum = sum + numbers[i];
	  }

	  System.out.println("Sum of all the " + n + " numbers is: " + sum);
	  average = (float) sum / n;
	  System.out.println("Average of all the " + n + " numbers is: " + average);
	 }
	}