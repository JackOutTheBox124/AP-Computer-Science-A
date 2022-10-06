package UnitThree.LessonFour;

import java.util.Scanner;

/**
 * Write a program to test if an integer input by the user is not between 65 and 100 inclusive. The program should print "True" if the input is not between 65 and 100 inclusive, and False otherwise.
 * <br>
 * Sample Run 1:
 * <pre>
 * Enter a number:
 * 79
 * False
 * </pre>
 * Sample Run 2:
 * <pre>
 * Enter a number:
 * 15
 * True
 * </pre>
 */
public class U3_L4_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scan.nextInt();

    System.out.println(65 > num || num > 100 ? "True" : "False");
  }
}
