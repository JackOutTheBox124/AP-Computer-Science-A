package UnitTwo.LessonEight;

import java.util.Scanner;
//import testing.Math;

/**
 * Write code that asks for a positive integer n, then prints 3 random integers from 2 to n+2 inclusive using {@link java.lang.Math#random Math.random()}.
 * <br>
 * Note #1: In the starter code for this exercise the line "import testing.Math;" appears. You should not remove this line from your code as it is required to correctly grade your code. Also make sure that your code outputs exactly 3 numbers (be particularly careful there aren't any extra numbers in your prompt for user input).
 * <br>
 * Note #2: Make sure your minimum output is 2 or more and make sure your maximum output is only up to n + 2 (so if user inputs 5, the maximum output should only be 7).
 * <br>
 * <i>Hint: Knowing your PEMDAS will help a lot.</i>
 * <br>
 * Sample Run:
 * <pre>
 * “Enter a positive integer”:
 * 7
 * 2
 * 5
 * </pre>
 */
public class U2_L8_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int posInt = Math.abs(scan.nextInt());
    for (int i = 0; i < 3; i++) {
      System.out.println((int) (Math.random() * (posInt + 1)) + 2);
    }
  }
}
