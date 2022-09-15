package UnitTwo.LessonThree;

import java.util.Scanner;

/**
 * Write a program that takes two words from the user.
 * <br>
 * Both words should be converted into lowercase.
 * <br>
 * Compare the two words in alphabetical order with the first letters of the two words, so a positive number should pop up if the first word is alphabetically higher than the second word, a negative number should pop up if it is the opposite, and zero should pop up if the first word and the second word share the same first letter.
 * <br>
 * Hint #1 : while these instructions don't specify a specific number to print, there is a String method which, if used correctly, will produce a number which matches these conditions in all possible cases.
 * <br>
 * Hint #2: There is a simple string method you can use to alphabetically and numerically compare the two input strings, but you gotta first obtain the first letter of the two inputs( the substring method is one way to go about it).
 * <br>
 * Sample run 1:
 * <pre>
 * Enter first word:
 * -Sterling
 * Enter second word:
 * -material
 * Result: 6
 * </pre>
 * Sample run 2:
 * <pre>
 * Enter first word:
 * -framing
 * Enter second word:
 * -framiNG
 * Result: 0
 * </pre>
 * Sample run 3:
 * <pre>
 * Enter first word:
 * -BAgels
 * Enter second word:
 * -candLes
 * Result: -1
 * </pre>
 */
public class U2_L3_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first word:");
    String first = scan.nextLine().toLowerCase();
    System.out.println("Enter second word:");
    String second = scan.nextLine().toLowerCase();
    System.out.println("Result: " + first.compareTo(second));
  }
}
