package UnitFour.LessonThree;

import java.util.Scanner;

/**
 * Input an int between 0 and 50 and print the numbers between it and 50, including the number itself and the number 50. If the number is less than or equal to 0, or greater than or equal to 50, print "error". Print 5 numbers per line. The last line may or may not have 5 numbers.
 * <br>
 * Hint - use modular division to determine where you need to add a line break.
 * <br>
 * Sample Run 1:
 * <pre>
 * Enter a number between 0 and 50:
 * 23
 * 23 24 25 26 27
 * 28 29 30 31 32
 * 33 34 35 36 37
 * 38 39 40 41 42
 * 43 44 45 46 47
 * 48 49 50
 * </pre>
 * Sample Run 2:
 * <pre>
 * Enter a number between 0 and 50:
 * -2
 * error
 * </pre>
 */
public class U4_L3_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number between 0 and 50:");

    int i = scan.nextInt();
    int num = 0;

    if (i <= 0 || i >= 50) {
      System.out.print("error");
    }
    else {
      num = i;
      for (i = i; i < 51; i++) {
        if (i == num) {
          System.out.println();
          num = i + 5;
        }
        System.out.print(i + " ");
      }
    }
  }
}
