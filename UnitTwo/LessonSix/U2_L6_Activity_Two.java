/* Lesson 6 Coding Activity Question 2 */
package UnitTwo.LessonSix;

import java.util.Scanner;
import shapes.*;


/**
 * Write code that takes an integer input and a double input from the user, and creates a RegularPolygon object where the integer is the number of sides and the double is the side length. The code should calculate the area of the RegularPolygon, print the area, then increment the number of sides of the RegularPolygon by two and print the new area.
 * <br>
 * Sample run:
 * <pre>
 * Enter number of sides:
 * > 4
 * Enter the side length:
 * > 5.6
 * Area with 4 sides: 31.36
 * Incrementing the number of sides by two
 * Area with 6 sides: 81.47566998803998
 * </pre>
 * Hint: You can use either the addSides or setNumSides methods from the RegularPolygon class to increment the number of sides by 2.
 * <br>
 * To reference the documentation for the Circle class, <a href="https://coderunner.projectstem.org/docs/shapes/index.html">click here</a>.
 */
public class U2_L6_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of sides:");
    int sides = scan.nextInt();
    System.out.println("Enter the side length:");
    double length = scan.nextDouble();
    RegularPolygon poly = new RegularPolygon(sides, length);
    System.out.println("Area with " + poly.getNumSides() + " sides: " + poly.getArea());
    System.out.println("Incrementing number of sides by two");
    poly.addSides(2);
    System.out.println("Area with " + poly.getNumSides() + " sides: " + poly.getArea());

  }
}
