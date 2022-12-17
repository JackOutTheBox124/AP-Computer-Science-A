package UnitFive.LessonFour;

/* Lesson 4 Coding Activity Question 2 */

/**
 * Write a method that takes 2 coordinates in a 2D plane (x, y coordinates) and computes the distance between these two points, according to the distance formula, which is as follows:
 * <br>
 * <img src="../../doc-files/distance.png" width=300></img>
 * <br>
 * This method must be named {@code distance()} and it must have 4 {@code int} parameters. The first parameter will be the x-coordinate of the first point, the second parameter will be the y-coordinate of the first point, the third parameter will be the x-coordinate of the second point, and the fourth parameter will be the y-coordinate of the second point. This method must return a {@code double}.
 * <br>
 * Calling {@code distance(0, 5, 0, 0)} would return {@code 5.0}.
 * <br>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 */
public class U5_L4_Activity_Two {
  public static double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2-y1) * (y2 - y1)));
  }
}