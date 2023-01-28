package Module3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int inputNumber = scanner.nextInt();
        int numberOfDigits = 0;
        if (inputNumber <= 0) {
            System.out.println("Error! Please enter a positive integer");
        } else {
            while (inputNumber > 0) {
                inputNumber /= 10;
                numberOfDigits++;
            }
            System.out.println("Number of digits: " + numberOfDigits);
        }
    }
}