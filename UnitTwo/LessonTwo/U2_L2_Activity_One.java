/* Lesson 2 Coding Activity Question 1 */

package UnitTwo.LessonTwo;

import java.util.Scanner;

/**
 * Write a program that asks the user for an item type to buy, a number of items and a weight (remember to think about what data type should be used for each one). The program should then print a sentence repeating this information in a sentence as shown in the sample run.
 * <br>
 * Sample run:
 * <pre>
 * What type of item are you buying?
 * widgets
 * How many are you buying?
 * 11
 * How much does each one weigh?
 * 3.75
 * 11 widgets at 3.75 pounds each will weigh 41.25 pounds total
 * </pre>
 * Note: All the user input prompts need to match the sample run exactly to get full credit for this activity.
 */
public class U2_L2_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item = scan.nextLine();
    System.out.println("How many are you buying?");
    int amount = scan.nextInt();
    System.out.println("How much does each one weigh?");
    double weight = scan.nextDouble();
    System.out.println(amount + " " + item + " at " + weight + " pounds each will weigh " + ((double) amount * weight) + " pounds total");
  }
}
