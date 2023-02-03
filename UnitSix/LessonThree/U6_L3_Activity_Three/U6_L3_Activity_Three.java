package UnitSix.LessonThree.U6_L3_Activity_Three;

/**
 * In the U6_L3_Activity_Three class, write a public static method called <code>printUn</code>, which has a single parameter of an array of String values.
 * The method <code>printUn</code>, which should be void, must print all the Strings from the parameter array which start with "un".
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L3_Activity_Three.java file or it will not be scored correctly.
 * <br>
 * Hint: you will need to get the substring containing the first 2 letters of each string, and compare it to "un", but be careful - your parameter array may contain Strings which are less than 2 characters long.
 * <br>
 * Sample run (runner class):
 * <pre>
 * Enter array length:
 * 6
 * Enter values:
 * universe
 * ubiquitous
 * unavoidable
 * i
 * look
 * nothing
 *
 *
 * universe
 * unavoidable
 * </pre>
 */
public class U6_L3_Activity_Three {
  public static void printUn(String[] arr) {
    for (String s : arr) {
      if (s.length() >= 2 && s.substring(0, 2).equals("un")) {
        System.out.println(s);
      }
    }
  }
}
