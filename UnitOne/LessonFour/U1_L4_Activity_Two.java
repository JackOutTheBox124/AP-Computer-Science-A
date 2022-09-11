/* Lesson 4 Coding Activity Question 2 */

package UnitOne.LessonFour;

import java.util.Scanner;

/**
 * Write a program which takes user input of a number of feet, and then prints the number of whole yards in that many feet (remember there are 3 feet in a yard). For example if the user enters
 * <pre>
 * 100
 * </pre>
 * The program should print
 * <pre>
 * 33
 * </pre>
 * As there are 33 whole yards in 100 feet (100 feet is the same as 33 yards and 1 feet)
 */
public class U1_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input how many feet you want converted to yards: ");
    int feet = scan.nextInt();
    System.out.println(feet/3);
  }
}
