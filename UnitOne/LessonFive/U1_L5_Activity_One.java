/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

package UnitOne.LessonFive;

import java.util.Scanner;

/**
 * Write a program which takes a positive three digit integer as an input. The program should print out the digits one per line in order.
 * <p>
 * Hint: Integer division can give you one of the digits, a combination of Integer division and modulus can be used to get the second digit, and modulus alone will be used to get the other.
 * <p>
 * Sample run:
 * <pre>
 * Please enter a three digit number:
 * 678
 *
 * Here are the digits:
 * 6
 * 7
 * 8
 * </pre>
 */
public class U1_L5_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a three digit number:");
    int num = scan.nextInt();
    System.out.println("Here are the digits:");
    int x = 1;
    for(int i = 0; i < 3; i++) {
      // mods the number by 10^x where x is 3, 2, and then 1, then divides it by 10^y where y is 3-x (2, 1, and then 0)
      System.out.println((int)((num % Math.pow(10,4-x)) / Math.pow(10, 3-x)));
      x++;
    }
  }
}
