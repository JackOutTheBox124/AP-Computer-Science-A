package CodingBat.Warmup1;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 * <br>
 * frontBack("code") → "eodc"
 * <br>
 * frontBack("a") → "a"
 * <br>
 * frontBack("ab") → "ba"
 */
public class frontBack {
  public String frontBack(String str) {
    return str.length() <= 1 ? str : str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
  }
}
