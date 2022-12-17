package UnitFour.LessonFive;

import java.util.Scanner;

/**
 * Write code that takes a user input of a String and an integer. The code should print each letter of the String the n number of times, where n is the integer input from the user.
 * <br>
 * Sample run:
 * <pre>
 * Input a String:
 * code
 * Input an integer:
 * 3
 * cccooodddeee
 * </pre>
 */
public class U4_L5_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Input a String:");
    String word = scan.nextLine();
    System.out.println("Input an integer:");
    int num = scan.nextInt();

    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < num; j++) {
        System.out.print(word.charAt(i));
      }
    }
  }
}
