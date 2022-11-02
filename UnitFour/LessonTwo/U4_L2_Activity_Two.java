package UnitFour.LessonTwo;

import java.util.Scanner;

/**
 * Write a program which takes a positive int input from the user, then prints the digits of that number in their places. You should separate the digits using spaces of line breaks so they appear individually.
 * <br>
 * Sample run:
 * <pre>
 * Enter a positive integer:
 * > 2587
 * 7
 * 80
 * 500
 * 2000
 * </pre>
 */
public class U4_L2_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive integer:");
    int num = scan.nextInt();
    int remainder = 0;
    int mult = 1;
    while (num > 0) {
      remainder = num % 10;
      remainder *= mult;

      System.out.println(remainder);
      mult *= 10;
      num /= 10;
    }
  }
}
