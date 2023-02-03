package UnitSeven.LessonTwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program that allows a user to input multiple words.
 * Your program should stop accepting words when the user enters "STOP".
 * Store the words in an <code>ArrayList</code>. The word STOP should not be stored in the list.
 * <br>
 * Next, print the <code>ArrayList</code>, then print all the strings from this list in the reverse order to which they appear in the list,
 * with each one on a new line, while adding the strings from the array in sequential order starting from the beginning.
 * <br>
 * Sample Run:
 * <pre>
 * Please enter words, enter STOP to stop the loop.
 * winter
 * fall
 * spring
 * summer
 * STOP
 *
 * [winter,fall,spring,summer]
 * summerwinter
 * springfall
 * fallspring
 * wintersummer
 * </pre>
 * Note: For this activity, you must use the class name, <code>U7_L2_Activity_One</code> and the method, <code>main.</code>
 * <br>
 * Hint: printing the entire <code>ArrayList</code> needs only one statement, however to print each <code>String</code> from the list individually on a new line starting from the last value, you will need to write a loop which starts at the end of the list and works backwards through it.
 */
public class U7_L2_Activity_One {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while (!input.equals("STOP")) {
      words.add(input);
      input = scan.nextLine();
    }
    System.out.println(words);
    for (int i = 0; i < words.size(); i++) {
      System.out.print(words.get(words.size() - (i + 1)));
      System.out.print(words.get(i) + "\n");
    }
  }
}
