package UnitThree.LessonOne;

import java.util.Scanner;

/**
 * Write a program to test if an integer input from the keyboard is divisible by two, or divisible by 3, or both!
 * <br>
 * Sample Run 1:
 * <pre>
 * Please enter an integer:
 * 7
 * </pre>
 * Sample Run 2:
 * <pre>
 * Please enter an integer:
 * 4
 * Divisible by 2!
 * </pre>
 * Sample Run 3:
 * <pre>
 * Please enter an integer:
 * 9
 * Divisible by 3!
 * </pre>
 * Sample Run 4:
 * <pre>
 * Please enter an integer:
 * 18
 * Divisible by 2!
 * Divisible by 3!
 * </pre>
 * (Hint: You will probably need to use the % operator for this one.)
 */
public class U3_L1_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer:");
    int num = scan.nextInt();

    System.out.print(num % 2 == 0 ? "\nDivisible by 2!" : "");
    System.out.print(num % 3 == 0 ? "\nDivisible by 3!" : "");
  }
}
