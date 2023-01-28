package Module3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = scanner.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters++;
            } else if (Character.isDigit(str.charAt(i))) {
                numbers++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                spaces++;
            } else {
                other++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other: " + other)
   