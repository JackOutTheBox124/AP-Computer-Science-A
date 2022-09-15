/* Lesson 1 Coding Activity Question 2 */

package UnitTwo.LessonOne;

import java.util.Scanner;

/**
 * Write a program that:
 * <ul>
 * <li>creates a String variable named order.</li>
 * <li>sets that variable (order) to a starting value of "apple pie".</li>
 * <li>prints a statement to say the current order is "apple pie" (the value of order).</li>
 * <li>asks the user to change the order.</li>
 * <li>changes the value of order to the value they type.</li>
 * <li>and prints this new value.</li>
 * </ul>
 * Reference the sample run below as you consider how to write this program.
 * <br>
 * Sample run:
 * <pre>
 * The current order is apple pie
 * I want to eat something else, what do you want to eat?
 * burger
 * The order has changed to burger
 * </pre>
 * Note: All the user input prompts need to match the sample run exactly to get full credit for this activity.
 */
public class U2_L1_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String order = "apple pie";
    System.out.println("The current order is " + order);
    System.out.println("I want to eat something else, what do you want to eat?");
    order = scan.nextLine();
    System.out.println("The order has changed to " + order);
  }
}
