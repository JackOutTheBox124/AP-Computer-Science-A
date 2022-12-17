/* Lesson 5 Coding Activity Question 2 */
package UnitTwo.LessonFive;
import java.util.Scanner;
import shapes.*;

/**
 * Write code which takes three decimal inputs from the user, creates a rectangle with length and width equal to the first input and a rectangle with length and width equal to the second and third input respectively, then prints both of these shapes. The output that you are printing must utilize the toString method inside Rectangle Class.
 * <br>
 * Sample run:
 * <pre>
 * Type a number for length and width:
 * 2.6
 * Type a length:
 * 10.4
 * Type a width:
 * 28.9
 * rectangle with length 2.6, width 2.6
 * rectangle with length 10.4, width 28.9
 * </pre>
 * To reference the documentation for the Circle or Rectangle class, <a href="https://coderunner.projectstem.org/docs/shapes/index.html">click here.<a/>
 */
public class U2_L5_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Type a number for length and width:");
    double a = scan.nextDouble();
    System.out.println("Type a length:");
    double len = scan.nextDouble();
    System.out.println("Type a width:");
    double wid = scan.nextDouble();

    Rectangle recA = new Rectangle(a);
    Rectangle recB = new Rectangle(len, wid);

    System.out.println(recA);
    System.out.println(recB);
  }
}
