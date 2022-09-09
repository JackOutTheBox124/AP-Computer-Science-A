package UnitOne.ClassInstruction;

/**
 * Self check to make sure we know how to correctly use PEMDAS
 * <p>
 * <b>P</b>lease <b>E</b>xcuse <b>M</b>y <b>D</b>ear <b>A</b>unt <b>S</b>ally
 *  <ul>
 *    <li>P: Parentheses - {@code [{( )}]}</li>
 *    <li>E: Exponents - {@link Math#pow(double, double) Math.pow(x, y)} - x^y</li>
 *    <li>M: Multiplication - {@code *}</li>
 *    <b>OR</b>
 *    <li>D: Division - {@code / %}</li>
 *    <li>A: Addition - {@code + ++}</li>
 *    <b>OR</b>
 *    <li>S: Subtraction - {@code - --}</li>
 *  </ul>
 */
public class SelfCheck_pg37 {
  public static void main(String[] args) {
    // 5 * 20 = 100
    // 100 + x = y
    // 8 % 50 = 8
    // 100 + 8 = 108
    // 108 - 4 = 104
    // 3 * 6 = 18
    // 18 / 4 = 4
    // 104 + 9 = (113)
    System.out.println(5*20 + 8 % 50 - 3 * 6 / 4 + 9);

    // 5 / 2 = 2
    // 6 * 2 = 12
    // 4 + 12 = 16
    // 3 * 16 = 48
    // 48 / 10 = 4
    // 5 - 4 = 1
    // 2 * 1 = 2
    // 8 % 2 = (0)
    System.out.println( 8 % (2* (5-3 *(4 + 6 * (5/2))/10)) );
  }
}
