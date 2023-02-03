package UnitSix.LessonThree.U6_L3_Activity_Two;

/**
 * Implement the method named <code>removeVowels</code> which processes the array of strings named <code>words</code>
 * by printing each String from <code>words</code> with only non-vowels on its own line.
 * <br>
 * For example, if words contains:
 * <pre>{"every", "nearing", "checking", "food", "stand", "value"}</pre>
 * The method should output:
 * <pre>
 * vry
 * nrng
 * chckng
 * fd
 * stnd
 * vl
 * </pre>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L3_Activity_Two.java
 * file or it will not be scored correctly.
 */
public class U6_L3_Activity_Two {
  public static void removeVowels(String[] words) {
    for (String word : words) {
      StringBuilder sb = new StringBuilder();
      for (char c : word.toCharArray()) {
        if (!isVowel(c)) {
          sb.append(c);
        }
      }
      System.out.println(sb.toString());
    }
  }

  private static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

}
