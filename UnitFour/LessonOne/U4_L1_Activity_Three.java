package UnitFour.LessonOne;

import java.util.Scanner;

/**
 * Write a program that requests the user to input a word, then prints out the first two letters - then skips a letter - then prints out the next two consecutive letters - then skips a letter - then this process repeats through the rest of the word.
 * <br>
 * <b>Hint #1</b> - You will need to use the substring method inside a loop in order to determine which letters of the String should be printed.
 * <br>
 * <b>Hint #2</b> - You can use the length method on the String to work out when this loop should end.
 * <br>
 * Sample run #1:
 * <pre>
 * Input a word:
 * calculator
 * cacuatr
 * </pre>
 * Sample run #2:
 * <pre>
 * Input a word:
 * okay
 * oky
 * </pre>
 */
public class U4_L1_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a word:");
    String word = scan.nextLine();
    int i = 0;

    while (i < word.length()) {
      if (i % 3 != 2) {
        System.out.print(word.substring(i, i + 1));
      }
      i++;
    }
  }
}
