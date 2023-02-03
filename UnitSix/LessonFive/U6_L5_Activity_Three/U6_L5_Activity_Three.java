package UnitSix.LessonFive.U6_L5_Activity_Three;

/**
 * Debug the <code>avg</code> method code in the U6_L5_Activity_Three class,
 * which is intended to return the average of the values in the parameter array of integers arr.
 * This method must use an enhanced for loop to iterate through <code>arr</code>.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L5_Activity_Three.java file or it will not be scored correctly.
 */
public class U6_L5_Activity_Three {
  public static double avg(int[] arr) {
    int s = 0;
    for (double n : arr) {
      s += n;
    }
    return (double) s / arr.length;
  }
}