package CodingBat.Warmup1;

/**
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 * <br>
 * front22("kitten") → "kikittenki"
 * <br>
 * front22("Ha") → "HaHaHa"
 * <br>
 * front22("abc") → "ababcab"
 */
public class front22 {
  public String front22(String str) {
    String s = str.length() < 2 ? str.substring(0, str.length()) : str.substring(0, 2);
    return s + str + s;
  }
}
