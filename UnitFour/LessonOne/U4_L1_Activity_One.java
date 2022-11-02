package UnitFour.LessonOne;

import java.util.Scanner;

/**
 * Write a program that requests that the user inputs any numbers, and if the user inputs the number 5, the program should print the sum of all numbers. Make sure 5 does not get added to the total sum.
 * <br>
 * Sample run:
 * <pre>
 * Enter any numbers (Enter 5 to stop)
 * 2
 * 12
 * 3
 * -1
 * 5
 * Sum is 16
 * </pre>
 */
public class U4_L1_Activity_One {
  public static void main(String[] args) {
    System.out.println("Enter any numbers (Enter 5 to stop)");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int sum = num;
    while (num != 5) {
      num = scan.nextInt();
      sum += num;
    }
    System.out.println("Sum is " + (sum - 5));
  }
}
