package UnitSeven.LessonSix.U7_L6_Activity_One;

/**
 * Write a method, public static void <code>sortAndPrintReverse(String [] arr)</code>,
 * which implements an insertion sort on the array <code>arr</code>.
 * The Strings should be sorted in descending order.
 * <br>
 * Unlike in the exercise from the previous lesson,
 * this method should print the values in the array (on one line with a single space between values)
 * multiple times: once after each insertion in the algorithm has been completed
 * (even if a value is inserted in its original place).
 * Make sure to use the <code>String.compareTo()</code> method when sorting to decide the correct order of the Strings.
 * <br>
 * For example, if <code>sortAndPrintReverse</code> method is called with the array <code>arr</code>
 * initialized as <code>{"lock", "key", "nail", "anvil", "hammer"}</code> then the following should be printed:
 * <pre>
 * lock key nail anvil hammer
 * nail lock key anvil hammer
 * nail lock key anvil hammer
 * nail lock key hammer anvil
 * </pre>
 * Write your <code>sortAndPrintReverse</code> method in the U7_L6_Activity_One class.
 * Use the runner class to test your method but do not add a main method to your U7_L6_Activity_One.java
 * file or your code will not be scored correctly.
 */
public class U7_L6_Activity_One {
  public static void sortAndPrintReverse(String[] arr) {
    for (int i = 1; i < arr.length; i++) {
      String temp = arr[i];
      int j = i - 1;
      while (j >= 0 && temp.compareTo(arr[j]) > 0) {
        arr[j + 1] = arr[j];
          j--;
      }
      arr[j + 1] = temp;
      for (String s : arr) {
        System.out.print(s + " ");
      }
      System.out.println();
    }
  }
}