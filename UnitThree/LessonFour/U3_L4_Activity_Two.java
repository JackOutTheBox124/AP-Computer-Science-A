package UnitThree.LessonFour;

import java.util.Scanner;

/**
 * Write a program to input two integers and print "Both are positive and even." to the screen, if both are positive and even. Print "At least one is negative or odd." otherwise. Consider the number 0 positive in this case.
 * <br>
 * Sample Run 1:
 * <pre>
 * Enter two numbers:
 * 78
 * 100
 * Both are positive and even.
 * </pre>
 * Sample Run 2:
 * <pre>
 * Enter two numbers:
 * 15
 * 52
 * At least one is negative or odd.
 * </pre>
 * Sample Run 3:
 * <pre>
 * Enter two numbers:
 * 0
 * -12
 * At least one is negative or odd.
 * </pre>
 */
public class U3_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    System.out.println((num1 % 2 == 0 && num1 >= 0) && (num2 % 2 == 0 && num2 >= 0) ? "Both are positive and even." : "At least one is negative or odd.");
  }
}
