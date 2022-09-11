/* Lesson 6 Coding Activity Question 3 */

package UnitOne.LessonSix;

import java.util.Scanner;

/**
 * Input a double and print the first three digits after the decimal point with a space between them.
 * <p>
 * Sample run:
 * <pre>
 * Please input a decimal number:
 * 67.3424
 * Answer: 3 4 2
 * </pre>
 * Hint - to complete the second coding activity in lesson 5 you had to learn how to get individual digits from an int value. You can reuse this method once you convert the user input to an appropriate int value (you will need both multiplication and casting for this).
 */
public class U1_L6_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number:");
    String decimal = Double.toString(scan.nextDouble()*1000);
    System.out.println("Answer: " + decimal.substring(decimal.indexOf(".") -3, decimal.indexOf(".")).replace("", " ").trim());
  }
}
