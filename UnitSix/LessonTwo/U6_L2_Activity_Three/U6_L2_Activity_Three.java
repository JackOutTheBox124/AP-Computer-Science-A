package UnitSix.LessonTwo.U6_L2_Activity_Three;

/**
 * In the U6_L2_Activity_Three class, write a public static method called numDivisible, which has two parameters. An integer value, num, followed by an array of int values. The method should return an integer which is the number of elements in the array that are divisible by num.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L2_Activity_Three.java file or it will not be scored correctly.
 * <pre>
 * Enter a value for num:
 * 2
 * Enter array length:
 * 5
 * Enter values:
 * 1
 * 2
 * 3
 * 4
 * 5
 * Num divisible by 2: 2
 * </pre>
 * <pre>
 * Enter a value for num:
 * 3
 * Enter array length:
 * 5
 * Enter values:
 * 1
 * 2
 * 3
 * 4
 * 5
 * Num divisible by 3: 1
 * </pre>
 */
public class U6_L2_Activity_Three {
  public static int numDivisible(int num, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % num == 0) {
        count++;
      }
    }
    return count;
  }

}
