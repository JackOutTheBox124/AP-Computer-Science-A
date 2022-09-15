
package UnitTwo.LessonFour.U2_L4_Activity_One;

import java.util.Scanner;

/**
 * A corrected version of {@link UnitTwo.LessonFour.U2_L4_Activity_One.U2_L4_Activity_One_Starter ./U2_L4_Activity_One_Starter}</a></a>
 */
public class U2_L4_Activity_One{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    // get first string
    System.out.println("Enter first string");
    String s1 =  scanner.nextLine();

    // get second string
    System.out.println("Enter second string");
    String s2 = scanner.nextLine();

    //Get number of letters to use from each string
    System.out.println("Enter number of letters from each word");
    int n = scanner.nextInt();

    // print last n letters of first string combined with first n letters of s2
    System.out.println(s1.substring(s1.length() - n,s1.length()) + s2.substring(0, n));

  }
}
