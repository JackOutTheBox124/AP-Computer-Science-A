package UnitTwo.LessonSix;

import java.util.Scanner;
import shapes.*;

/**
 * Write code that takes input from the user for the radius (double) of a circle, and create a circle with that radius. The program should then print a sentence with the circumference and area of the circle. You should use the appropriate Circle methods to obtain the circumference and area of the circle rather than calculating these values yourself.
 * <br>
 * Sample run:
 * <pre>
 * Enter the radius of the circle:
 * > 3
 * A circle with a radius 3.0 has a circumference of 18.84955592153876 and an area of 28.274333882308138
 * </pre>
 * Hint: You can approach this problem by saving the double (radius) as a variable and then creating the Circle, or you can create the Circle and use methods from the Circle class to set the radius.
 * <br>
 * To reference the documentation for the Circle class, <a href="https://coderunner.projectstem.org/docs/shapes/index.html">click here</a>.
 */
public class U2_L6_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the radius of the circle:");
    Circle circle = new Circle(scan.nextDouble());
    System.out.println("A circle with a radius " + circle.getRadius() + " has a circumference of " + circle.getCircumference() + " and an area of " + circle.getArea());
  }
}
