/* Lesson 4 Coding Activity Question 4 */

package UnitOne.LessonThree;

import java.util.Scanner;

/**
 * Write code which asks the user to enter the price of an item and tells them how much money they would get back from $10. It's okay for this to be negative. Your output must be in the exact format shown, including the dollar signs.
 *  <p>
 * Sample Run:
 * <pre>
 * Enter a price:
 * 3.50
 * Change from $10: $6.5
 * </pre>
 */
public class CodingActivityQuestionFour {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a price:");
    double price = scan.nextDouble();
    System.out.println("Change from $10: $" +  String.format("%.2f", 10-price));
  }
}
