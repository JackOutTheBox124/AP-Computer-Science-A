package UnitSeven.LessonFour.U7_L4_Activity_One;

import java.util.ArrayList;

/**
 * Implement the method <code>countSecondInitial</code> which accepts as parameters an <code>ArrayList</code>
 * of Strings and a letter, stored in a <code>String</code>. (Precondition: the String <code>letter</code>
 * has only one character. You do not need to check for this.) The method should return the number of Strings
 * in the input <code>ArrayList</code> that is in the second index with the given letter.
 * Your implementation should ignore the case of the Strings in the <code>ArrayList</code>.
 * <br>
 * Sample Run:
 * <pre>
 * Please enter words, enter STOP to stop the loop.
 * find
 * dice
 * hi
 * dye
 * STOP
 * Enter initials to search for, enter STOP to stop the loop.
 * i
 * Search for i: 3
 * </pre>
 * Hint - the algorithm to implement this method is just a modified version of the linear search algorithm.
 * <br>
 * Use the runner class to test your method but do not add a main method to your U7_L4_Activity_One.java
 * file or your code will not be scored correctly.
 * <br>
 * We have provided a couple of sample runs that can be used to test your code,
 * but you do not need to include a Scanner and ask for user input when submitting your code for grading
 * because the grader will test these inputs automatically.
 */
public class U7_L4_Activity_One {
  public static int countSecondInitial(ArrayList<String> list, String letter) {
    int count = 0;
    for (String s : list) {
      if (s.length() > 1 && s.substring(1, 2).equalsIgnoreCase(letter)) {
        count++;
      }
    }
    return count;
  }
}

