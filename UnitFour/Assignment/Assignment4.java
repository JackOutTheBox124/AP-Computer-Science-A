package UnitFour.Assignment;

import java.util.Scanner;

/**
 * Assignment 4 - String Shortener
 * <br>
 * Uses 2 different algorithms to shorten string input and displays results from each
 * <br>
 * Algorithm 1: Removes all vowels unless it is at the beginning of a word as well as removing any identical letters immediately after (double letters)
 * <br>
 * Algorithm 2: Creates a string by taking the first appearance of each letter in a string and the number of times it appears in the string
 *
 * @author Jack
 */
public class Assignment4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Type the message to be shortened");

    // declaring variables
    String word = scan.nextLine().toLowerCase();
    String variable = "";
    // declared as string builders to modify easily
    StringBuilder algOneMsg = new StringBuilder();
    StringBuilder algTwoMsg = new StringBuilder();

    int vowelsRemoved = 0;
    int repeatsRemoved = 0;
    int index = 0;
    int index2 = 0;
    int letter = 1;
    int unique = 0;
    int a = 0;

    // for loop that runs for as many times as there are characters in the string
    for (int i = 0; i < word.length(); i++){
      // goes through each letter in the string
      variable = (word.substring(i,i + 1));

      // if the letter contains a vowel, the vowelsRemoved variable increases by 1 and nothing is added to the Algorithm 1 message
      if (i != 0 && word.charAt(i - 1) != ' ' && (variable.equals("a") || variable.equals("e") ||variable.equals("i") ||variable.equals("o") || variable.equals("u"))) {
        vowelsRemoved++;
      }
      // if there is a repeated letter, the repeatsRemoved variable increases by 1 and nothing is added to the Algorithm 1 message
      else if ((i != 0) && (word.substring(i,i+ 1).equals(word.substring(i- 1,i)))) {
        repeatsRemoved++;
      }
      else {
        // adds the letter to the algorithm 1 message if it isn't a vowel or repeating letter
        algOneMsg.append(variable);
      }

      // checks how many times each letter appears in the string
      while (a < word.length()) {
        if (word.charAt(a) != ' ' && (word.substring(a, a + 1).equals(word.substring(i, i + 1))) && index != a) {
          letter++;
        }
        a++;
      }
      // adds the first appearance of a character to the algorithm 2 message
      index2 = algTwoMsg.indexOf(word.substring(i, i + 1));
      if (index2 == -1 && (word.charAt(i) != ' ')) {
        algTwoMsg.append(letter).append(word.charAt(i));
        unique++;
      }
      // resets variables for next iteration
      a = 0;
      index++;
      letter = 1;
    }
    // new line to separate from user input
    System.out.println("");
    // algorithm 1 results
    System.out.println("Algorithm 1");
    System.out.println("Vowels removed: " + vowelsRemoved);
    System.out.println("Repeats removed: " + repeatsRemoved);
    System.out.println("Algorithm 1 message: " + algOneMsg);
    System.out.println("Algorithm 1 characters saved: " + (word.length() - algOneMsg.length()));
    System.out.println("");
    // algorithm 2 results
    System.out.println("Algorithm 2");
    System.out.println("Unique characters found: " + unique);
    System.out.println("Algorithm 2 message: " + algTwoMsg);
    System.out.println("Algorithm 2 characters saved: " + (word.length() - algTwoMsg.length()));
  }
}
