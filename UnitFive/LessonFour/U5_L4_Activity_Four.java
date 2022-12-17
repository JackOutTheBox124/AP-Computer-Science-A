package UnitFive.LessonFour;

/* Lesson 4 Coding Activity Question 4 */

/**
 * Write a method that takes two {@link java.lang.String String} parameters, returns the number of times the second string appears in the first string.
 * <br>
 * This method must be named {@code substringCount()} and have two {@link java.lang.String String} parameters. This method must return an {@code integer}.
 *
 * For example, substringCount("aabbababaa", "a") would return 6.
 *
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 */
public class U5_L4_Activity_Four
{

  /* Add the method hasRepeat here */

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){

  }
  */
  public static int substringCount(String str, String subStr) {
    int index = str.indexOf(subStr);
    int count = 0;

    while(index != -1) {
      count++;
      str = str.substring(index + 1);
      index = str.indexOf(subStr);
    }
    return count;
  }
}