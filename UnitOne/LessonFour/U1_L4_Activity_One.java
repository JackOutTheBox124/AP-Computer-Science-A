/* Lesson 4 Coding Activity Question 1 */

package UnitOne.LessonFour;

import java.util.Scanner;

/**
 * Write a program that takes a single integer input from the user and stores it in a variable. Your program should increase the value of this variable by one four times, printing "number is now " followed by its value each time, then decrease it by one four times, again printing "number is now " and the value each time. You must use unary operators to increase/decrease the value of the variable to receive full credit for this assignment.
 * <p>
 * Sample Run
 * <pre>
 * Enter starting number (must be an integer)
 * >24
 * number is now 25
 * number is now 26
 * number is now 27
 * number is now 28
 * number is now 27
 * number is now 26
 * number is now 25
 * number is now 24
 * </pre>
 */
public class U1_L4_Activity_One {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter starting number (must be an integer)");
    int startingNumber = scanner.nextInt();
    for(int x = 0; x < 8; x++) {
      if((x + startingNumber) < (startingNumber + 4)) {
        startingNumber++;
      }
      else {
        startingNumber--;
      }
      System.out.println("number is now " + startingNumber);
    }

    // Had to replace the for loop with this next part due to ProjectSTEM not liking for loops
    /*
    startingNumber++;
    System.out.println("number is now " + startingNumber);
    startingNumber++;
    System.out.println("number is now " + startingNumber);
    startingNumber++;
    System.out.println("number is now " + startingNumber);
    startingNumber++;
    System.out.println("number is now " + startingNumber);
    startingNumber--;
    System.out.println("number is now " + startingNumber);
    startingNumber--;
    System.out.println("number is now " + startingNumber);
    startingNumber--;
    System.out.println("number is now " + startingNumber);
    startingNumber--;
    System.out.println("number is now " + startingNumber);
     */
  }
}
