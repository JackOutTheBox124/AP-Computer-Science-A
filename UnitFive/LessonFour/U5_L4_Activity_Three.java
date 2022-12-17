package UnitFive.LessonFour;

/* Lesson 4 Coding Activity Question 3 */

import shapes.*;

/**
 * Write a method that takes two circles and returns the (positive) difference between their circumferences.
 * This method must be named {@code circDiff()} and have 2 {@link shapes.Circle Circle} parameters. This method must return a {@code double}.
 * <br>
 * For example suppose two {@link shapes.Circle Circle} objects were initialized as shown:
 * <pre>
 * Circle c1 = new Circle(8);
 * Circle c2 = new Circle(2.5);
 * </pre>
 * The method call {@code circDiff(c1, c2)} should then return the value {@code 34.55751918948772}.
 * <br>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 * <br>
 * To reference the documentation for the Circle class, <a href="https://coderunner.projectstem.org/docs/shapes/index.html">click here</a>.
 */
public class U5_L4_Activity_Three {
  public static double circDiff(Circle c1, Circle c2) {
    return Math.abs(c1.getCircumference() - c2.getCircumference());
  }
}