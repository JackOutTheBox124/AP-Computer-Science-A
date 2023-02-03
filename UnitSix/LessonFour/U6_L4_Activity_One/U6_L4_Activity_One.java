package UnitSix.LessonFour.U6_L4_Activity_One;

/**
 * Write a public static method named <code>insert</code>.
 * The <code>insert</code> method should have the signature <code>insert(String[] words, String newWord,
 * int place)</code>, should return a <code>String</code>, and should function as described below.
 * When called, if <code>place</code> does not represent a valid index for <code>words</code>,
 * then the method will return a String that says "you need a valid number" to indicate the insertion could not be performed and so nothing else.
 * Otherwise the method will insert the String <code>newWord</code> into the array <code>words</code> at the index <code>place</code>,
 * moving each subsequent entry one place further and losing the final String in the array.
 * The method will then return a concatenated string of all the words in the words array to indicate the insertion has taken place.
 * <br>
 * Use the runner class to test this method: do not add a main method to your code in the U6_L4_Activity_One.java file or it will not be scored correctly.
 * <br>
 * Sample runs (runner class):
 * <pre>
 * Enter array length:
 * 3
 * Enter values:
 * one
 * two
 * three
 * Enter new String:
 * four
 * Enter place:
 * 1
 * Method return: onefourtwo
 * Array contents: {one, four, two}
 * </pre>
 * <pre>
 * Enter array length:
 * 2
 * Enter values:
 * this
 * that
 * Enter new String:
 * those
 * Enter place:
 * 2
 * Method return: you need a valid number
 * Array contents: {this, that}
 * </pre>
 */
public class U6_L4_Activity_One {
  public static String insert(String[] words, String newWord, int place) {
    if (place < 0 || place >= words.length) {
      return "you need a valid number";
    }
    for (int i = words.length - 1; i > place; i--) {
      words[i] = words[i - 1];
    }
    words[place] = newWord;
    return String.join("", words);
  }
}

