package UnitThree.LessonSeven;

import java.util.Scanner;

/**
 * Write the code which prints "Access granted!" if the correct password, "bulbasaur" is entered, and "Access denied!" otherwise.
 * <br>
 * Sample runs:
 * <pre>
 * Enter password:
 * charmander
 * Access denied!
 * </pre>
 * <pre>
 * Enter password:
 * bulbasaur
 * Access granted!
 * </pre>
 */
public class U3_L7_Activity_One {
  public static void main(String[] args) {
    final String password = "bulbasaur";
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter password:");
    String inp = scan.nextLine();

    if(inp.equals(password)) {
      System.out.println("Access granted!");
    }
    else {
      System.out.println("Access denied!");
    }


  }
}
