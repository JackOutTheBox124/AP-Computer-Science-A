package UnitSix.LessonTwo.U6_L2_Activity_One;


/**
 * In the U6_L2_Activity_One class, there is a method called containsNeg() that has a single parameter, arr, which is an array of double values. You will edit this method so that it returns a true if the array being passed contains a negative value and return a false otherwise.
 * <br>
 * The runner class already has code provided that will prompt the user for the array length, prompt for double values, and call and output the method you are creating. All you need to do is edit the method in order to return the corresponding true or false value.
 * <br>
 * Sample runs (runner class):
 * <pre>
 * Enter array length:
 * 4
 * Enter values:
 * 1.1
 * 2.2
 * 3.3
 * -4.4
 * Contains negative: true
 *</pre>
 * <pre>
 * Enter array length:
 * 3
 * Enter values:
 * 1.1
 * 2.2
 * 3.3
 * Contains negative: false
 * </pre>
 */
public class U6_L2_Activity_One {

  public static boolean containsNeg(double[] arr) {
    for (double value : arr) {
      if (value < 0) {
        return true;
      }
    }
    return false;
  }

}