package UnitSeven.LessonSix.U7_L6_Activity_Two;

import java.util.ArrayList;

/**
 * Write a method, <code>public static int insertSort(ArrayList<Integer> list)</code>,
 * which implements an insertion sort on the <code>ArrayList</code> of <code>Integer</code>objects <code>list</code>.
 * In addition your <code>insertSort</code> method should return an <code>int</code> which represents a
 * statement execution count recording how many times two elements from the ArrayList are compared.
 * For example, if the parameter list prints as [4, 5, 6, 7, 4] before a call to insertSort,
 * it should print as [4, 4, 5, 6, 7] after the method call.
 * This call should return the value 7 since 7 values need to be compared to implement an insertion sort on this array.
 *
 * Hint - when counting the comparisons for each element, you may need to adjust your count value by 1 after the inner loop, but not every time (think what happens when the value is inserted at the very start).
 *
 * Write your InsertSort method in the U7_L6_Activity_Two class. Use the runner class to test your method but do not add a main method to your U7_L6_Activity_Two.java file or your code will not be scored correctly.
 */
import java.util.ArrayList;

public class U7_L6_Activity_Two {
  public static int insertSort(ArrayList<Integer> list) {
    int count = 0;
    for (int i = 1; i < list.size(); i++) {
      int key = list.get(i);
      int j = i - 1;
      while (j >= 0 && list.get(j) > key) {
        list.set(j+1, list.get(j));
        j--;
        count++;
      }
      list.set(j+1, key);
      if (j >= 0) {
        count++;
      }
    }
    return count;
  }
}