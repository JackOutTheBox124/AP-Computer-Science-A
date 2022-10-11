package UnitThree.LessonSix.U3_L6_Activity_Two;

import java.util.Scanner;

/**
 * The template code provided is intended to take two inputs, x and y, from the user and print "pass" if one or more of the following is true:
 * <ul>
 * <li>y is not greater than 9</li>
 * <li>x is not less than or equal 2 and x * y is greater than 10</li>
 * </ul>
 * However, when using De Morgan's law to simplify this code, the programmer has made some mistakes. Can you correct the errors so the code functions as intended?
 */
public class U3_L6_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    if(!(y > 9) || (!(x <= 2) && (x * y > 10)))
      System.out.println("pass");
  }
}
