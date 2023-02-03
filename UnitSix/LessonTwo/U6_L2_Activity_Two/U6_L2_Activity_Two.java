package UnitSix.LessonTwo.U6_L2_Activity_Two;

/**
 * In the U6_L2_Activity_Two class, write a public static method called numDivisibleBy3, which has a single parameter of an array of int values. The method should return the number of elements in the array which are divisible by 3.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L2_Activity_Two.java file or it will not be scored correctly.
 * <br>
 * Sample runs (runner class):
 * <pre>
 * Enter array length:
 * 5
 * Enter values:
 * 3
 * 6
 * 3
 * 1
 * 2
 * Number divisible by three: 3
 * </pre>
 * <pre>
 * Enter array length:
 * 5
 * Enter values:
 * 1
 * 2
 * 4
 * 5
 * 7
 * Number divisible by three: 0
 * </pre>
 */
public class U6_L2_Activity_Two {
  public static int numDivisibleBy3(int[] array) {
    int count = 0;
    for (int j : array) {
      if (j % 3 == 0) {
        count++;
      }
    }
    return count;
  }
}
