package UnitTwo.LessonEight;

import java.util.Scanner;

/**
 * Write a program that calculates the slope between two coordinates: (x1, y1) and (x2, y2). The program should take four decimal inputs from the user, in the order of x1, x2, y1, y2. Then print the slope.
 * <br>
 * <b>Note:</b> slope formula looks like this:
 * <br>
 * <img src="../../doc-files/SlopeFormula.png" width=300></img>
 * <br>
 * <b>Hint:</b> Just find 4 points and plug in the formula.
 * <br>
 * Sample run:
 * <pre>
 * Enter the first x-coordinate:
 * 3.9
 * Enter the second x-coordinate:
 * 5.1
 * Enter the first y-coordinate:
 * 4.8
 * Enter the second y-coordinate:
 * 1.2
 * Slope: -3.0000000000000004
 * </pre>
 */
public class U2_L8_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first x-coordinate:");
    double x1 = scan.nextDouble();
    System.out.println("Enter the second x-coordinate:");
    double x2 = scan.nextDouble();
    System.out.println("Enter the first y-coordinate:");
    double y1 = scan.nextDouble();
    System.out.println("Enter the second y-coordinate:");
    double y2 = scan.nextDouble();

    System.out.println((y2-y1)/(x2-x1));
  }
}
