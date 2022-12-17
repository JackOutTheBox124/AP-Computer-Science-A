package UnitFive.LessonTwo;

/**
 * Write a method named <code>printDouble</code> that takes a double, <code>num</code>, parameter followed by an integer, <code>n</code>, parameter and prints <code>num</code> <code>n</code> times.
 * <br>
 * For example, <code>printDouble(2.5, 2)</code> would print the following:
 * <pre>
 * 2.5
 * 2.5
 * </pre>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 */
public class U5_L2_Activity_Three {

  /* Add the method swap here */

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){

  }
  */

  public static void printDouble(double num, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(num);
    }
  }
}