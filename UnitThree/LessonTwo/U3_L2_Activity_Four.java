package UnitThree.LessonTwo;

import java.util.Scanner;

/**
 * Write a program to test if two double inputs by the user are not valid test scores. The program should print "Not Valid" (not including the quotes) if one or more of the numbers entered by the user are NOT between 0 and 100 inclusive.
 * <br>
 * Sample run 1:
 * <pre>
 * Enter two test scores:
 * 75.5
 * 82.6
 * </pre>
 * Sample run 2:
 * <pre>
 * Enter two test scores:
 * 102.1
 * 99.9
 * Not Valid
 * </pre>
 * Sample run 3:
 * <pre>
 * Enter two test scores:
 * 101.6
 * 102.1
 * Not Valid
 * Not Valid
 * </pre>
 * Hint - you will need more than one if statement to be sure that the score is not between 0 and 100.
 */
public class U3_L2_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two test scores:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    System.out.print(num1 > 100 || num1 < 0 ? "\nNot Valid" : "");
    System.out.print(num2 > 100 || num2 < 0 ? "\nNot Valid" : "");

  }
}
