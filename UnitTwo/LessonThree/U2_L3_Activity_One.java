/* Lesson 3 Coding Activity Question 1 */

package UnitTwo.LessonThree;

import java.util.Scanner;

/**
 * Write code that accepts two inputs from the user (a String, followed by an integer, n) that prints out the first n letters of the input string, followed by the last n letters of the input string (on the same line). You may assume that the integer, n, will not be greater than or equal to the length of the string.
 * <br>
 * Sample run:
 * <pre>
 * Enter a string:
 * dictionary
 * Enter a number:
 * 1
 * dy
 * </pre>
 * Hint - we saw in the lesson how to get the first letter of a string using the substring method. Think how you could use the .length() String method to find the index of the last character, and how you could use this index in the substring method to get the last character.
 */
public class U2_L3_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = scan.nextLine();
    System.out.println("Enter a number:");
    int number = scan.nextInt();
    System.out.println(str.substring(0,1));
    System.out.println(Math.min(str.length(), number));
  System.out.println(str.substring(0, Math.min(str.length(), Math.abs(number))) + str.substring(Math.max(str.length()-Math.abs(number), 0)));

  }
}
