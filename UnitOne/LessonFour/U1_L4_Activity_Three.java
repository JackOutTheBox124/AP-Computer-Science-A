/* Lesson 4 Coding Activity Question 3 */

package UnitOne.LessonFour;

import java.util.Scanner;

/**
 * Input the circumference of a circle and print the radius and area. The answers should be decimal values and must be printed in the format shown in the sample run.
 * <p>
 * Remember the formula for circumference is 2 * pi * r and the formula for area is pi * r * r. You can use 3.14 for the value of pi in this activity.
 * <p>
 * Sample Run:
 * <p>
 * <pre>
 * Enter a circumference:
 * 25.12
 * Radius: 4.0
 * Area: 50.24
 * </pre>
 */
public class U1_L4_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a circumference:");
    final double PI = 3.14; //Math.PI
    double circumference = scan.nextDouble();

    double radius = Math.round((circumference/(2*PI)) * 100.0) / 100.0;
    double area = Math.round((PI*Math.pow(radius, 2)) * 100.0) / 100.0;
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + area);
  }
}
