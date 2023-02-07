package UnitSeven.LessonFive.U7_L5_Activity_One;

/**
 * Write a method, <code>public static void sortAndPrintReverse(String[] arr)</code>,
 * which implements a selection sort on the array <code>arr</code>,
 * so that the Strings are sorted in descending order.
 * Then, print the sorted values on one line with a single space between values.
 * Make sure to use the <code>String.compareTo()</code> method when sorting to
 * decide the correct order of the Strings.
 * <br>
 * For example, if <code>sortAndPrintReverse</code> is called with the array <code>arr</code>
 * initialized as {"forest", "apple", "willow", "lake", "trees"} then the following should be printed:
 * <pre>willow trees lake forest apple</pre>
 * Write your sortAndPrintReverse method in the U7_L5_Activity_One class.
 * Use the runner class to test your method but do not add a main method to your U7_L5_Activity_One.java
 * file or your code will not be scored correctly.
 */
public class U7_L5_Activity_One {
  public static void sortAndPrintReverse(String[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j].compareTo(arr[maxIndex]) > 0) {
          maxIndex = j;
        }
      }
      String temp = arr[maxIndex];
      arr[maxIndex] = arr[i];
      arr[i] = temp;
    }
    for (String s : arr) {
      System.out.print(s + " ");
    }
  }
}