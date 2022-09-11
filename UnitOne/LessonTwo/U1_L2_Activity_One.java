/* Lesson 2 Coding Activity Question 1 */

package UnitOne.LessonTwo;

import java.util.Scanner;

/**
 * Write code to ask the user to enter their favorite food and print the following message:
 *
 * <pre>I like to eat ______ as well!</pre>
 *
 * Where ______ is replaced with the name of the food input by the user. Remember, you'll need to create a {@link java.util.Scanner Scanner} and use the method {@link Scanner#nextLine() nextLine} on it to get the user input and store it in a variable.
 */
public class U1_L2_Activity_One {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your favorite food?");
    String food = scanner.nextLine();
    System.out.println("I like to eat " + food + " as well!");
  }
}
