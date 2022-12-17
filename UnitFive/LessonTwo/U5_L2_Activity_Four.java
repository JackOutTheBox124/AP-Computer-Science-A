package UnitFive.LessonTwo;


/**
 * Write a method called coinConverter that accepts a single integer parameter representing some number of pennies and prints the correct number of dollars, quarters, dimes, and nickels that can be made from the pennies. The method should also print any leftover pennies.
 * <br>
 * This method must be called <code>coinConverter()</code> and its parameter must be an integer.
 * <br>
 * Calling <code>coinConverter(1234)</code> would print the following:
 * <pre>
 * Dollar Bills: 12
 * Quarters: 1
 * Dimes: 0
 * Nickels: 1
 * Pennies: 4
 * </pre>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 * <br>
 * Hint - you might want to review the unit 1 lessons on the use of integer and modular division as you will need to use these in your answer. Start by thinking about how many pennies there are in a single dollar bill, and therefore how you would work out the number of whole dollar bills in a given number of pennies (and how many pennies would be leftover).
 */
public class U5_L2_Activity_Four {

  public static void main(String[] args) {
    coinConverter(1234);
  }
  /* Add the method realTime here */

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){

  }
  */

  public static void coinConverter(int x)

  {
    int db = x / 100;
    int q = (x % 100) / 25;
    int d = ((x % 100) % 25) / 10;
    int n = (((x % 100) % 25) % 10) / 5;
    int p = x % 10;
    System.out.println("Dollar Bills: " + db);
    System.out.println("Quarters: " + q);
    System.out.println("Dimes: " + d);
    System.out.println("Nickels: " + n);
    System.out.println("Pennies: " + p);
  }
}