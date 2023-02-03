package UnitSeven.LessonThree.U7_L3_Activity_Two;

import java.util.*;

/**
 * Write a public static void method named <code>printStatistics</code>
 * which takes a single parameter of an <code>ArrayList</code> of <code>Integer</code> objects.
 * The method should print the Sum, Average and Mode of the integers in the parameter <code>ArrayList</code>.
 * If there is more than one mode
 * (i.e. two or more values appear equal numbers of times and no values appear more often),
 * the method should print "no single mode".
 * <br>
 * For example, if the <code>ArrayList</code> parameter prints as <code>[2, 5, 7, 5]</code>
 * the <code>printStatistics</code> method should produce the following output:
 * <pre>
 * Sum: 19
 * Average: 4.75
 * Mode: 5
 * </pre>
 * Alternatively if the <code>ArrayList</code> parameter prints as <code>[1, 5, 9, 5, 1]</code> the
 * <code>printStatistics</code> method should produce the following output:
 * <pre>
 * Sum: 21
 * Average: 4.2
 * Mode: no single mode
 * </pre>
 * Write your <code>printStatistics</code> method in the <code>U7_L3_Activity_Two</code> class.
 * Use the runner class to test your method but do not add a main method to your
 * <code>U7_L3_Activity_Two.java</code> file or your code will not be scored correctly.
 */
public class U7_L3_Activity_Two {
  public static void printStatistics(ArrayList<Integer> list) {
    int sum = 0;
    int maxCount = 0;
    int mode = 0;

    Collections.sort(list);
    // Calculate the sum
    for (int num : list) {
      sum += num;
    }

    // Calculate the average
    double average = (double) sum / list.size();

    // Find the mode
    for (int i = 0; i < list.size(); i++) {
      int count = 0;
      for (Integer integer : list) {
        if (list.get(i).equals(integer)) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        mode = list.get(i);
      }
      if(count == maxCount && mode != list.get(i)) {
        mode = -1;
      }

    }

    // Print the sum, average, and mode
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Mode: " + (mode > 0 ? mode : "no single mode"));
  }
}