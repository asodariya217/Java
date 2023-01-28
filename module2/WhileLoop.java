package Module3;


//Program to print Leap Year
import java.util.Scanner;

public class WhileLoop { 
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a year:");
      int year = scanner.nextInt();
      scanner.close();

      // If the year is divisible by 4, it is a leap year
      boolean isLeapYear = (year % 4 == 0);
      if(isLeapYear) {
          System.out.println(year + " is a Leap Year");
      } else {
          System.out.println(year + " is not a Leap Year");
      }
  }
}
