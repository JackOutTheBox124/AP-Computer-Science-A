package UnitFour.LessonTwo;

import java.util.Scanner;

/**
 * Ask the user for two numbers. Print only the odd numbers between them. You should also print the two numbers if they are odd.
 * <br>
 * Sample Run 1:
 * <pre>
 * Enter two numbers:
 * 2
 * 11
 *
 * 3 5 7 9 11
 * </pre>
 * Sample Run 2:
 * <pre>
 * Enter two numbers:
 * 10
 * 44
 *
 * 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43
 * </pre>
 */
public class U4_L2_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    while (num1 <= num2)
    {
      if ((num1 % 2) == 1)
      {
        System.out.print(num1 + " ");
      }
      num1++;
    }
  }
}
