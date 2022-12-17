package CodingBat.Warmup1;

/**
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 * <br>
 * backAround("cat") → "tcatt"
 * <br>
 * backAround("Hello") → "oHelloo"
 * <br>
 * backAround("a") → "aaa"
 */
public class backAround {
  public String backAround(String str) {
    return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
  }
}
