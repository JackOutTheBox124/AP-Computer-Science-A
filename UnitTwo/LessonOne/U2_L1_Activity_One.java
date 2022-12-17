/* Lesson 1 Coding Activity Question 1 */

package UnitTwo.LessonOne;;

import java.util.Scanner;
/**
 * Write a program which asks the user for their name and favorite number. The program should then print a sentence repeating this information as shown in the sample run.
 * <br>
 * Sample run:
 * <pre>
 * What is your name?
 * Sara
 * What is your favorite number?
 * 16
 * Your name is Sara and you like the number 16.
 * </pre>
 * Note: All the user input prompts need to match the sample run exactly to get full credit for this activity.
 */
public class U2_L1_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("What is your favorite number?");
    int number = scan.nextInt();

    System.out.println("Your name is " + name + " and you like the number " + number + ".");

  }
}