/* Lesson 6 Coding Activity Question 2 */

package UnitOne.LessonSix;

import java.util.Scanner;

/**
 * Write a program which takes two doubles as input, then prints the sum of the numbers when they are both rounded to their nearest whole number. You may assume the double input is always positive.
 * <p>
 * Hint: Remember not to just truncate the number - look back at video 3 from the lesson if you don't remember how to ensure the number is rounded, not just truncated.
 * <p>
 * Sample run:
 * <pre>
 * Please input two decimal numbers:
 * 57.3934
 * 22.5211
 * Answer: 57 + 23 = 80
 * </pre>
 */
public class CodingActivityQuestionTwo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input two decimal numbers:");
    int x = (int) Math.round(scan.nextDouble());
    int y = (int) Math.round(scan.nextDouble());

    System.out.println("Answer: " + x + " + " + y + " = " + (x+y));
  }
}
