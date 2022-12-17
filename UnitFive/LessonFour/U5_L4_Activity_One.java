package UnitFive.LessonFour;

/* Lesson 4 Coding Activity Question 1 */

import shapes.*;

/**
 * Write a method that takes two RegularPolygons, and returns the total number of sides between the two regular polygons.
 * <br>
 * This method must be named {@code totalSides()} and it must have two {@code RegularPolygon} parameters. This method must return an {@code integer}.
 * <br>
 * For example, suppose two {@code RegularPolygon} objects were initialized as shown:
 * <pre>
 * RegularPolygon poly1 = new RegularPolygon(4, 6.0);
 * RegularPolygon poly2 = new RegularPolygon(8);
 * </pre>
 * The method call {@code totalSides(poly1, poly2)} should then return the value {@code 12}.
 * <br>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 * <br>
 * To reference the documentation for the RegularPolygon class, <a href="https://coderunner.projectstem.org/docs/shapes/index.html">click here</a>.
 */
public class U5_L4_Activity_One
{
  /* Add the method totalSides here */

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before submitting your code
  // /*

  // */
  public static int totalSides(RegularPolygon poly1, RegularPolygon poly2) {
    return poly1.getNumSides() + poly2.getNumSides();
  }
}