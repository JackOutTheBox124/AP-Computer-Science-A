package CodingBat.Warmup1;

/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 * <br>
 * monkeyTrouble(true, true) → true
 * <br>
 * monkeyTrouble(false, false) → true
 * <br>
 * monkeyTrouble(true, false) → false
 */
public class monkeyTrouble {
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
  }
}
