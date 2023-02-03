package UnitSeven.LessonOne;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a Java program that allows a user to input multiple words.
 * Your program should stop accepting words when the user enters "STOP".
 * Store the words in an <code>ArrayList</code>.
 * The word STOP should not be stored in the list.
 * <br>
 * Next, print the size of the list, followed by the list itself.
 * <br>
 * Then, replace the last index with the first one and remove the value from the first index,
 * but only if the list has a length greater than two. Finally, reprint the list.
 * <br>
 * Sample Run:
 * <pre>
 * Please enter words, enter STOP to stop the loop.
 * phone
 * computer
 * laptop
 * television
 * newspaper
 * STOP
 *
 * 5
 * [phone,computer,laptop,television,newspaper]
 * [computer,laptop, television,phone]
 * </pre>
 * Note: For this activity, you must use the class name, <code>U7_L1_Activity_One</code> and the method, main.
 * <br>
 * Hint: use a while loop to take the user input - remember that this type of loop runs until the condition you specify is no longer met so you can base this off the user input.
 */
public class U7_L1_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while (!input.equals("STOP")) {
      words.add(input);
      input = scan.nextLine();
    }
    System.out.println(words.size());
    System.out.println(words);
    if (words.size() > 2) {
      words.add(words.get(0));
      words.remove(0);
      words.remove(words.size() - 2);
    }
    System.out.println(words);
  }
}