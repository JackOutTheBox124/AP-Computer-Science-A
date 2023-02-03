package UnitSix.LessonFive.U6_L5_Activity_Two;

/**
 * Debug the <code>product</code> method code in the U6_L5_Activity_Two class,
 * which is intended to return the product of the values in the parameter array <code>arr</code>.
 * This method must use an enhanced for loop to iterate through <code>arr</code>.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L5_Activity_Two.java file or it will not be scored correctly.
 */
public class U6_L5_Activity_Two {
  public static int product(int[] arr) {
    int p = 1;
    for(int k : arr) {
      p *= k;
    }
    return p;
  }
}