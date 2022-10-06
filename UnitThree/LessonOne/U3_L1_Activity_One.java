package UnitThree.LessonOne;

/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

/**
 * Write a program to test if a double input from the keyboard is equal to the double 12.345. If the input is equal to 12.345, print "YES" (without the quotes).
 * <br>
 * Sample run 1:
 * <pre>
 * Please enter a double:
 * 54.321
 * </pre>
 * Sample run 2:
 * <pre>
 * Please enter a double:
 * 12.345
 * YES
 * </pre>
 */
public class U3_L1_Activity_One {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please print a double:");
    double num = scan.nextDouble();

    System.out.print(num == 12.345 ? "\nYES" : "");
  }
}