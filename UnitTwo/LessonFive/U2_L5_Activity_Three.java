/* Lesson 5 Coding Activity Question 3 */

package UnitTwo.LessonFive;

import java.util.Scanner;
import shapes.*;

/**
 * Write code which asks for a side length from the user and creates an equilateral triangle and square with that length. The output that you are printing must utilize the toString method inside RegularPolygon Class.
 * <br>
 * Sample run:
 * <pre>
 * Type a side length:
 * 7.5
 * equilateral triangle with side length 7.5
 * square with side length 7.5
 * </pre>
 * Hint: Make sure you use the right data types when taking user input.
 * <br>
 * To reference the documentation for the RegularPolygon class, <a href="https://coderunner.projectstem.org/docs/shapes/index.html">click here.<a/>
 */
public class U2_L5_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type a side length:");
    double len = scan.nextDouble();

    RegularPolygon triangle = new RegularPolygon(len);
    RegularPolygon square = new RegularPolygon(4, len);

    System.out.println(triangle);
    System.out.println(square);
  }
}
