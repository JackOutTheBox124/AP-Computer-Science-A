package CodingBat.Warmup1;

/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 * <br>
 * sumDouble(1, 2) → 3
 * <br>
 * sumDouble(3, 2) → 5
 * <br>
 * sumDouble(2, 2) → 8
 */
public class sumDouble {
  public int sumDouble(int a, int b) {
    int sum = a + b;

    if(a == b) {
      sum *= 2;
    }

    return sum;
  }
}
