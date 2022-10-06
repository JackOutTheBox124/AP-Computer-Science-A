package UnitThree.LessonTwo;

import java.util.Scanner;

/**
 * Write a program which takes five doubles as inputs and tests if the average of the inputs is greater than or equal to 89.95. If so, the program should print out the phrase "ABOVE AVERAGE" (without the quotes).
 * <br>
 * Sample Run 1:
 * <pre>
 * Please enter five numbers:
 * 85.2
 * 95.6
 * 80.4
 * 88.1
 * 91.8
 * </pre>
 * Sample Run 2:
 * <pre>
 * Please enter five numbers:
 * 90.1
 * 86.3
 * 95.6
 * 92.7
 * 89.1
 * ABOVE AVERAGE
 * </pre>
 */
public class U3_L2_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter five numbers:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();
    double num5 = scan.nextDouble();

    System.out.print((num1 + num2 + num3 + num4 + num5) / 5 >= 89.95 ? "\nABOVE AVERAGE" : "");
  }
}
