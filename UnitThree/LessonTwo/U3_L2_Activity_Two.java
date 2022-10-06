package UnitThree.LessonTwo;

import java.util.Scanner;

/**
 * Write a program that takes two decimal numbers as input and print the smallest. If the numbers are equal, print one of them.
 * <br>
 * Sample Run 1:
 * <pre>
 * Please enter two numbers:
 * 55.7
 * 55.1
 *
 * Smallest is: 55.1
 * </pre>
 * Sample Run 2:
 * <pre>
 * Please enter two numbers:
 * 15
 * 15
 *
 * Smallest is: 15.0
 * </pre>
 */
public class U3_L2_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();

    System.out.print(num1 <= num2 ? num1 : num2);
  }
}
