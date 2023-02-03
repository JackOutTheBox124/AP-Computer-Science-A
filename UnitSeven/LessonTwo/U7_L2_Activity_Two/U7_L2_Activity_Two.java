package UnitSeven.LessonTwo.U7_L2_Activity_Two;

import java.util.ArrayList;

/**
 * Write a public static method named <code>highestNum</code> which takes an <code>ArrayList</code> of <code>Integer</code> objects,
 * and returns the highest value in this list.
 * Write your <code>highestNum</code> method in the <code>U7_L2_Activity_Two class</code>.
 * Use the runner class to test your method but do not add a main method to the <code>U7_L2_Activity_Two.java</code>
 * file or your code will not be scored correctly.
 * <br>
 * Hint: when you write your method header, and specify the type of the parameter as an <code>ArrayList</code>,
 * make sure you include the data type your <code>ArrayList</code> will contain in angle brackets (<>).
 */
public class U7_L2_Activity_Two {
  public static int highestNum(ArrayList<Integer> list) {
    int highest = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > highest) {
        highest = list.get(i);
      }
    }
    return highest;
  }
}
