package UnitSeven.LessonTwo.U7_L2_Activity_Three;

import java.util.ArrayList;

/**
 * Complete the <code>getEvens</code> method so it returns a new <code>ArrayList</code> of Integers containing
 * all even Integers from the parameter <code>ArrayList</code> vals in the order they originally appeared.
 * The contents of vals should not change.
 * <br>
 * For example, if an <code>ArrayList</code> containing the Integers 1,2,4,5,7
 * in that order is passed as a parameter to <code>getEvens</code>,
 * it should return an <code>ArrayList</code> containing the Integers 2,4 in that order.
 * <br>
 * Write your <code>getEvens</code> method in the U7_L2_Activity_Three class.
 * Use the runner class to test your method but do not add a main method to your U7_L2_Activity_Three.java file or your code will not be scored correctly.
 */
public class U7_L2_Activity_Three {
  public static ArrayList<Integer> getEvens(ArrayList<Integer> vals) {
    ArrayList<Integer> evens = new ArrayList<Integer>();

    for (Integer val : vals) {
      if (val % 2 == 0) {
        evens.add(val);
      }
    }
    return evens;
  }
}
