/* Lesson 2 Coding Activity Question 2 */

package UnitOne.LessonTwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that asks the user for four names, then prints the names while switching the first and the last name.
 * <p>
 * Sample Run:
 * <pre>
 * Please enter four names:
 * Jesse
 * David
 * Elaine
 * Sandy
 *
 * Sandy David Elaine Jesse
 * </pre>
 * <i>Hint:</i> One solution to this challenge would be to use 4 separate variables, one for each name.
 */
public class U1_L2_Activity_Two {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();

    System.out.println("Please enter four names:");
    for (int i = 0; i < 4; i++) {
      String name = scanner.nextLine();
      names.add(name);
    }
    System.out.println(names.get(3) + " " + names.get(1) + " " + names.get(2) + " " + names.get(0));
  }
}
