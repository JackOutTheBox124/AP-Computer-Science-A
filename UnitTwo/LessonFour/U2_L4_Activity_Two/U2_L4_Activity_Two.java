package UnitTwo.LessonFour.U2_L4_Activity_Two;

import java.util.Scanner;
/**
 * In this exercise you will debug the code which has been provided in the {@link U2_L4_Activity_Two_Starter starter file}. The code is intended to do the following:
 * <br>
 * <ul>
 *   <li>Take a string input and store this in the variable str1</li>
 *   <li>Copy this string into another variable str2 using the String constructor</li>
 *   <li>Change str1 to the upper-case version of its current contents</li>
 *   <li>Change the first letter of str2 to the upper-case version of its current contents</li>
 *   <li>Print the value of str2 on one line, then the value of str1 on the next</li>
 * </ul>
 */
public class U2_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a string");
    String str1 = scan.nextLine();
    String str2 = new String(str1);
    str1 = str1.toUpperCase();
    str2 = str2.substring(0,1).toUpperCase() + str2.substring(1);
    System.out.println(str2);
    System.out.println(str1);
  }
}
