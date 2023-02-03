package UnitSeven.LessonFour.U7_L4_Activity_Two;

import java.util.ArrayList;

/**
 * Write a public static method named <code>searchSecond</code> which implements a modified version
 * of the linear search algorithm on an <code>ArrayList</code> of <code>String</code> objects.
 * Instead of returning the index of the first appearance of the target <code>String</code> in the
 * <code>ArrayList</code> your method should return the index of the second appearance of this
 * <code>String</code>. If the target <code>String</code> is not in the <code>ArrayList</code> or only
 * appears once, your method should return -1.
 * <br>
 * Write your <code>searchSecond</code> method in the <code>U7_L4_Activity_Two</code> class,
 * and ensure that the parameters for the method are an <code>ArrayList</code> of <code>String</code>
 * objects followed by a <code>String</code>. Use the runner class to test your method but do not add a
 * main method to your <code>U7_L4_Activity_Two.java</code> file or your code will not be scored correctly.
 * <br>
 * Sample Run 1:
 * <pre>
 * Please enter words, enter STOP to stop the loop.
 * apple
 * bird
 * apple
 * cat
 * apple
 * STOP
 * Enter String to search for.
 * apple
 * searchLast returns: 2
 * </pre>
 * Sample Run 2:
 * <pre>
 * Please enter words, enter STOP to stop the loop.
 * apple
 * bird
 * apple
 * cat
 * apple
 * STOP
 * Enter String to search for.
 * bird
 * searchLast returns: -1
 * </pre>
 * Sample Run 3:
 * <pre>
 * Please enter words, enter STOP to stop the loop.
 * apple
 * bird
 * apple
 * cat
 * apple
 * STOP
 * Enter String to search for.
 * dog
 * searchLast returns: -1
 * </pre>
 * We have provided a couple of sample runs that can be used to test your code,
 * but you do not need to include a Scanner and ask for user input when submitting your code for
 * grading because the grader will test these inputs automatically.
 */
public class U7_L4_Activity_Two {
  public static int searchSecond(ArrayList<String> list, String target) {
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(target)) {
        count++;
        if (count == 2) {
          return i;
        }
      }
    }
    return -1;
  }
}
