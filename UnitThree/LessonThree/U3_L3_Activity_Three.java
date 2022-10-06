package UnitThree.LessonThree;

import java.util.Scanner;

/**
 * Create a program to check if a user can do simple addition. The program will first take two integer inputs (the two numbers to add together), then allow the user to input a third integer as their answer to the sum of the two numbers. If they enter the correct sum print “Correct!” otherwise print “Wrong”. You must use an else statement in your code to receive full credit for this exercise.
 * <br>
 * Sample run 1:
 * <pre>
 * Please enter two integers:
 * > 4
 * > 7
 * 4 + 7 = ?
 * > 12
 * Wrong
 * </pre>
 * Sample run 2:
 * <pre>
 * Please enter two integers:
 * > 8
 * > 2
 * 8 + 2 = ?
 * > 10
 * Correct!
 * </pre>
 */
public class U3_L3_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter two integers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    System.out.println(num1 + " + " + num2 + " = ?");
    int ans = scan.nextInt();
    System.out.println(ans == num1+num2 ? "Correct!" : "Wrong");
    if (0 == 0) {
      int x = 0;
    }
    else {
      int x = 1;
    }
  }
}
