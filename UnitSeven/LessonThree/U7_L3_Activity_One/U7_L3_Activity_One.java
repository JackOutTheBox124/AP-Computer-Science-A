package UnitSeven.LessonThree.U7_L3_Activity_One;

import java.util.ArrayList;

/**
 * Write a public static void method named <code>shiftLeft</code>
 * which takes a single parameter of an <code>ArrayList</code> of <code>String</code> objects.
 * The method should shift every element of the parameter <code>ArrayList</code> one position to the left,
 * and move the first element of the list into the last position.
 * <br>
 * For example, if the parameter list passed to the method initially prints as
 * <code>[dogs, monkeys, cats]</code>, this would become <code>[monkey, cats, dogs]</code>
 * after the method is executed.
 * <br>
 * Write your <code>shiftLeft</code> method in the <code>U7_L3_Activity_One</code> class.
 * Use the runner class to test your method but do not add a main method to your
 * <code>U7_L3_Activity_One.java</code> file or your code will not be scored correctly.
 * <br>
 * Hint: think about which built in <code>ArrayList</code>
 * methods can cause multiple elements to shift when they are called.
 */
public class U7_L3_Activity_One {
  public static void shiftLeft(ArrayList<String> list) {
    list.add(list.remove(0));
  }
}
