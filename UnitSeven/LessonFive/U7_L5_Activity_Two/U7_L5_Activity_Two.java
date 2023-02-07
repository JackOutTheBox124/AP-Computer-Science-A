package UnitSeven.LessonFive.U7_L5_Activity_Two;

import java.util.ArrayList;

/**
 * Write a method, <code>public static void selectSortReverse(ArrayList<Integer> list)</code>,
 * which implements a selection sort on the ArrayList of Integer objects <code>list</code>.
 * The elements should be sorted in descending order,
 * so that the largest element comes first and the smallest element comes last. For example,
 * if the parameter list would be printed as [4, 6, 3, 7] before a call to <code>selectSortReverse</code>,
 * it would be printed as [7, 6, 4, 3] after the method call.
 * <br>
 * Write your <code>selectSortReverse</code> method in the U7_L5_Activity_Two class.
 * Use the runner class to test your method but do not add a main method to your U7_L5_Activity_Two.java
 * file or your code will not be scored correctly.
 * <br>
 * Note: your <code>selectSortReverse</code> method should not print the ArrayList -
 * this is done by the runner class in this exercise.
 */
public class U7_L5_Activity_Two {
  public static void selectSortReverse(ArrayList<Integer> list) {
    int maxIndex;
    int temp;

    for (int i = 0; i < list.size() - 1; i++) {
      maxIndex = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j) > list.get(maxIndex)) {
          maxIndex = j;
        }
      }
      temp = list.get(i);
      list.set(i, list.get(maxIndex));
      list.set(maxIndex, temp);
    }
  }
}