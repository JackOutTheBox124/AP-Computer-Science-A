/* Lesson 6 Coding Activity Question 1 */

package UnitOne.LessonSix;

import java.util.Scanner;

/**
 * Write a Java program that precisely calculates the decimal value of a fraction, and prints the answer to the screen. The value displayed must be accurate.
 * <p>
 * Sample Run:
 * <pre>
 * Please enter the numerator:
 * 5
 * Please enter the denominator:
 * 20
 *
 * The decimal value is: 0.25
 * </pre>
 */
public class U1_L6_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the numerator:");
    int numerator = scan.nextInt();
    System.out.println("Please enter the denominator:");
    int denominator = scan.nextInt();
    System.out.println("The decimal value is: " + (double)numerator/(double)denominator);
  }
}
