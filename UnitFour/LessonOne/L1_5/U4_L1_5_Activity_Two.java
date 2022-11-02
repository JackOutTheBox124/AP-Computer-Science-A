package UnitFour.LessonOne.L1_5;

import java.util.Scanner;

/**
 * Write a program prints the sum of the first n positive integers.
 * <br>
 * This is calculated by adding all the numbers from 1 up to the number, n, together. For example, if n were equal to 5, then we’d have 5 + 4 + 3 + 2 + 1 = 15.
 */
public class U4_L1_5_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int sum = 0;

    while(num > 0) {
      sum += num;
      num--;
    }

    System.out.println(sum);
  }
}
