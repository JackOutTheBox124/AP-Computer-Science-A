package CodingBat.Warmup1;

/**
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 * <br>
 * notString("candy") → "not candy"
 * <br>
 * notString("x") → "not x"
 * <br>
 * notString("not bad") → "not bad"
 */
public class notString {
  public String notString(String str) {
    return str.startsWith("not") ? str : "not " + str;
  }


}
