package UnitFour.LessonOne;

import java.util.Scanner;

/**
 * Write a program that will input a list of test scores from the keyboard. When the user enters -1, print the largest score.
 * <br>
 * Hint: Helps to use an if statement inside of a while statement
 * <br>
 * Sample Run:
 * <pre>
 * Enter the Scores:
 * 44
 * 22
 * 88
 *
 * The largest score is 88
 * </pre>
 */
public class U4_L1_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Scores:");
    int input = scan.nextInt();
    int highest = input;
    while (input != -1) {
      if (input > highest) highest = input;
      input = scan.nextInt();
    }
    System.out.println("The largest score is " + highest);
  }
}
