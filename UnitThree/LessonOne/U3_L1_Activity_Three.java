package UnitThree.LessonOne;

import java.util.Scanner;

/**
 * Write a program that takes two integers from the keyboard and tests if the second integer is twice the first integer. If the second integer is twice the first integer, print "YES" (without the quotes).
 * <br>
 * Sample run 1:
 * <pre>
 * Please enter two integers:
 * 44
 * 65
 * </pre>
 * Sample run 2:
 *<pre>
 * Please enter two integers:
 * 20
 * 40
 * YES
 * </pre>
 */
public class U3_L1_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two integers:");
    int numOne = scan.nextInt();
    int numTwo = scan.nextInt();

    System.out.println(numTwo / 2 == numOne ? "\nYES" : "");
  }
}
