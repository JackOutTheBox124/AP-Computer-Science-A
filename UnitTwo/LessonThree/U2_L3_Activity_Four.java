package UnitTwo.LessonThree;

import java.util.Scanner;

/**
 * Write code which takes a sentence as an input from the user and then prints the length of the first word in that sentence.
 * <br>
 * Hint #1: think about how you know where the first word ends - you may assume that the sentence contains more than one word.
 * <br>
 * Hint #2: To make your life easier, use a string method that utilizes space. It looks kind of looks like this: String.method(" ").
 * <br>
 * Sample run 1:
 * <pre>
 * Enter a sentence:
 * Everything in its right place
 * 10
 * </pre>
 * Sample run 2:
 * <pre>
 * Enter a sentence:
 * Down is the new up
 * 4
 * </pre>
 */
public class U2_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sentence = scan.nextLine();
    System.out.println(sentence.split(" ")[0].length());
  }
}
