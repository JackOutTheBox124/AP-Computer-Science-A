/* Lesson 3 Coding Activity Question 2 */

package UnitTwo.LessonThree;

import java.util.Scanner;

/**
 * Write code to take and print a String input from the user, then take in the amount of characters to delete at the end of the input (assume that the number won’t be greater than the length of the string), and finally print out the modified string.
 * <br>
 * Sample run:
 * <pre>
 * Enter a string:
 * happy
 * How many characters would you like to delete at the end?
 * 2
 * hap
 * </pre>
 */
public class U2_L3_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = scan.nextLine();
    System.out.println("How many characters would you like to delete at the end?");
    int num = scan.nextInt();
    System.out.println(str.substring(0, str.length()-num));
  }
}
