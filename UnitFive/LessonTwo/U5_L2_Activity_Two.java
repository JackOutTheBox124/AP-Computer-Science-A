package UnitFive.LessonTwo;

/**
 * Write a void method named reverser which takes a string as a parameter and prints the string backwards. For example the call <code>reverser("monitor")</code> would print "rotinom".
 * <br>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 */
public class U5_L2_Activity_Two {

/* Add the method reverser here */

// You can uncomment and add to the main method to test your code
// You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){

  }
   */

  public static void reverser(String str) {
    StringBuilder reversed = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed.append(str.charAt(i));
    }
    System.out.println(reversed);
  }
}
