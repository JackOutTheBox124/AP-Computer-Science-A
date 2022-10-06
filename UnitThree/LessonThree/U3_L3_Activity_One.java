package UnitThree.LessonThree;

import java.util.Scanner;

/**
 * Write a program that takes the input of an integer number from the keyboard and prints "Even" if the integer is even , and prints “Odd" otherwise. You must use an else statement to gain full credit for this exercise.
 * <br>
 * Sample run 1
 * <pre>
 * Please enter an integer
 * 7
 * Odd
 * </pre>
 * Sample run 2
 * <pre>
 * Please enter an integer
 * -2
 * Even
 * </pre>
 */
public class U3_L3_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int num = scan.nextInt();
    if(num % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
  }
}
