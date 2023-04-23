package UnitTen.LessonTwo.U10_L2_Activity_One;

/**
 * Debug the recursive <code>stringReverse</code> method, which is intended to return the input String word reversed (i.e. the same characters but in reverse order).
 * <br>
 * Use the runner class to test this method but do not write your own main method or your code will not be graded correctly.
 */
public class U10_L2_Activity_One {
  public static String stringReverse(String word) {
    if (word.length() < 2) return word;
    return stringReverse(word.substring(1)) + word.charAt(0);
  }
}
