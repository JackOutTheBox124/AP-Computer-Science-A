package UnitThree.LessonOne;

import java.util.Scanner;

/**
 * Write a program to test if an integer input from the keyboard is equal to 48. If it is, print "YES" (without the quotes).
 * <br>
 * Sample run 1:
 * <pre>
 * Please enter an integer:
 * 46
 * </pre>
 * Sample run 2:
 * <pre>
 * Please enter an integer:
 * 48
 * YES
 * </pre>
 */
public class U3_L1_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer:");
    int num = scan.nextInt();
    System.out.print(num == 48 ? "\nYES" : "");
  }
}
