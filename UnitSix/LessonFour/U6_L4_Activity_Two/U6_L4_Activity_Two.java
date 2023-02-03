package UnitSix.LessonFour.U6_L4_Activity_Two;

/**
 * Write two public static methods in the U6_L4_Activity_Two class. The first should have the signature
 * <code>swap(int[] arr, int i, int j)</code> and return type <code>void</code>.
 * This method should swap the values at the indices i and j of the array arr (precondition: i and j are both valid indices for arr).
 * <br>
 * The second method should have the signature <code>allReverseSwap(int[] arr)</code> and return type <code>void</code>.
 * The method should swap the values of all the last elements with the beginning elements in the array,
 * so that for example the array {1, 2, 3, 4, 5, 6} becomes {6, 5, 4, 3, 2, 1} after this method is called.
 * <br>
 * Hint: Use a for loop alongside the swap method to create the <code>allReverseSwap</code> method.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L4_Activity_Two.java file or it will not be scored correctly.
 */
public class U6_L4_Activity_Two {
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void allReverseSwap(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      swap(arr, i, arr.length - i - 1);
    }
  }
}