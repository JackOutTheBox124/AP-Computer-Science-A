package UnitThree.LessonFive.U3_L5_Activity_One;

import java.util.Scanner;

/**
 * Debug the code provided in the starter file.
 * This program is supposed to print "Ratio OK" if the ratio of two integers entered by the user is between 1 exclusive and 8 inclusive
 * (i.e. if the first divided by the second is greater than 1 and less than or equal to 8).
 * The debugged code should not produce any error messages as long as two integers are entered by the user.
 */
public class U3_L5_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 integers:");
    double x = scan.nextInt();
    double y = scan.nextInt();
    if(y > 0 && 1 < x/y && x/y <= 8) {
      System.out.println("Ratio OK");
    }
  }
}
