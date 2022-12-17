package CodingBat;

public class String2 {
  /**
   * Given a string, return a string where for every char in the original, there are two chars.
   * <br>
   * doubleChar("The") → "TThhee"
   * <br>
   * doubleChar("AAbb") → "AAAAbbbb"
   * <br>
   * doubleChar("Hi-There") → "HHii--TThheerree"
   * @param str
   * @return
   */
  public String doubleChar(String str) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      res.append(str.charAt(i));
      res.append(str.charAt(i));
    }
    return res.toString();
  }

  /**
   * Return the number of times that the string "hi" appears anywhere in the given string.
   * <br>
   * countHi("abc hi ho") → 1
   * <br>
   * countHi("ABChi hi") → 2
   * <br>
   * countHi("hihi") → 2
   * @param str
   * @return
   */
  public int countHi(String str) {
    int count = 0;
    for (int i = -1; (i = str.indexOf("hi", i + 1)) != -1;) {
      count++;
    }
    return count;
  }

  /**
   * Return true if the string "cat" and "dog" appear the same number of times in the given string.
   * catDog("catdog") → true
   * catDog("catcat") → false
   * catDog("1cat1cadodog") → true
   */
  public boolean catDog(String str) {
    int differences = 0;
    for (int i = 0; i < str.length() - 2;i++) {
      if (str.substring(i, i + 3).equals("cat")) differences++;
      if (str.substring(i, i + 3).equals("dog")) differences--;
    }
    return (differences == 0);
  }

  /* Return the number of times that the string "code" appears anywhere in the
   * given string, except we'll accept any letter for the 'd', so "cope" and
   * "cooe" count.
   */
  public int countCode(String str) {
    int count = 0;

    for(int i = 0; i < str.length() - 3; i++) {
      if(str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')
        count++;
    }

    return count;
  }
}
