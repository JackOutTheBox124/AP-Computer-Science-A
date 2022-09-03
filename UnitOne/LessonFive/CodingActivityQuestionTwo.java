/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

package UnitOne.LessonFive;

import java.util.Scanner;

/**
 * Write a program which takes a four digit number as an input, then prints the digits of this number one per line in reverse order.
 * <p>
 * Hint: Break this challenge down into repetitions of the steps used for activity 1. Using multiple variables will let you store digits and intermediate results you need.
 * <p>
 * Sample run:
 * <pre>
 * Please enter a four digit number:
 * 5678
 *
 * Here are the digits:
 * 8
 * 7
 * 6
 * 5
 * </pre>
 */
public class CodingActivityQuestionTwo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a four digit number:");
    int num = scan.nextInt();
//    int num = 5678;
    System.out.println("Here are the digits:");

//    int i = 1;
//    for(int x=0; x<4; x++) {
//      int temp = (int)(num % Math.pow(10, i));
//      System.out.println((int)(temp / Math.pow(10, (int)(Math.log10(temp)+1)-1)));
//      i++;
//    }
    int i = 1;
    for(int x=0; x<4; x++) {
      int one = (int)(num % Math.pow(10,i));
      int two = (int)(one / Math.pow(10, i-1));
      System.out.println(two);

      i++;
    }
  }
}
