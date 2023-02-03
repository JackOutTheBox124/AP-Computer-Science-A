package UnitSix.LessonFive.U6_L5_Activity_One;

/**
 * Debug the <code>reverse</code> method code in the U6_L5_Activity_One class, which is intended to print each String from a parameter array backwards on a new line. Unlike the reverse method you wrote in lesson 3, this method uses an enhanced for loop to iterate through the array.
 * Use the runner class to test this method: do not add a main method to your code in the U6_L5_Activity_One.java file or it will not be scored correctly.
 * <br>
 * Sample run (runner class):
 * <pre>
 * Enter array length:
 * 4
 *
 * Enter values:
 * hill
 * mold
 * tree
 * lake
 * llih
 * dlom
 * eert
 * ekal
 * </pre>
 */
public class U6_L5_Activity_One {
  public static void reverse(String[] words) {
    for(String s : words) {
      for(int i = s.length()-1; i >= 0; i--) {
        System.out.print(s.substring(i,i+1));
      }
      System.out.println();
    }
  }
}
