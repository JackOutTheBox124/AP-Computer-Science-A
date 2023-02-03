package UnitSix.LessonThree.U6_L3_Activity_One;

/**
 * Implement the <code>findShortest</code> method to return the String with the shortest length stored in the parameter
 * array named <code>words</code> (you may assume that <code>words</code> is not empty).
 * If several Strings have the same length it should print the first String in the list with the shortest length.
 * <br>
 * For example, if the following array were declared:
 * <pre>
 * String[] wordList = {
 *   "high",
 *   "every",
 *   "nearing",
 *   "checking",
 *   "food ",
 *   "stand",
 *   "value",
 *   "best",
 *   "energy",
 *   "add",
 *   "grand",
 *   "notation",
 *   "abducted",
 *   "food ",
 *   "stand"
 * };
 * </pre>
 * The method call <code>findShortest(wordList)</code> would return the String <code>"add"</code>.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L3_Activity_One.java file
 * or it will not be scored correctly.
 * <br>
 * Hint - this algorithm is very similar to the algorithms you have seen to find maximum/minimum values in unit 4.
 * You need a variable which will keep track of the shortest word in the array (either directly or as the array index of that word).
 * Start this variable off with a sensible value, update it whenever a shorter word is found, then return the shortest word at the end.
 */
public class U6_L3_Activity_One {
  public static String findShortest(String[] words) {
    String shortest = words[0]; // initialize shortest to the first word in the array
    for (int i = 1; i < words.length; i++) {
      if (words[i].length() < shortest.length()) {
        shortest = words[i];
      }
    }
    return shortest;
  }
}