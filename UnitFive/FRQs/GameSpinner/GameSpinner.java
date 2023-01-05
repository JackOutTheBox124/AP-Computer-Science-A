package UnitFive.FRQs.GameSpinner;

/**
 * The GameSpinner class represents a spinner with a certain number of sectors,
 * which can be used to play games that involve spinning a spinner.
 */
public class GameSpinner {
  /** The number of sectors on the spinner */
  private int sectors;

  /** The current number of times in a row that the spinner has landed on the same number */
  private int currentRun = 0;

  /** The number that the spinner landed on in the last spin */
  private int lastNum;

  /**
   * Constructs a new GameSpinner object with the specified number of sectors.
   *
   * @param sectors the number of sectors on the spinner
   */
  public GameSpinner(int sectors) {
    this.sectors = Math.max(3, sectors);
  }

  /**
   * Spins the spinner and returns the number that it lands on.
   *
   * @return the number that the spinner landed on
   */
  public int spin() {
    // Generate a random number between 1 and the number of sectors
    int num = (int) (Math.random() * sectors) + 1;

    // If the spinner landed on the same number as the last spin or this is the first spin,
    // increment the current run count. Otherwise, reset the current run count to 1.
    if (num == lastNum || lastNum == 0) {
      currentRun++;
    } else {
      currentRun = 1;
    }

    // Update the lastNum field to store the number that was just spun
    lastNum = num;

    // Return the number that the spinner landed on
    return num;
  }

  /**
   * Returns the number that the spinner landed on in the last spin.
   *
   * @return the number that the spinner landed on in the last spin
   */
  public int getNum() {
    return lastNum;
  }

  /**
   * Returns the current number of times in a row that the spinner has landed on the same number.
   *
   * @return the current number of times in a row that the spinner has landed on the same number
   */
  public int currentRun() {
    return currentRun;
  }

  /**
   * Calculates the probability of the spinner landing on a certain number, given the number of sectors on the spinner.
   *
   * @param sectors the number of sectors on the spinner
   * @param num the number to calculate the probability for
   * @return the probability of the spinner landing on the specified number
   */
  public static double probability(int sectors, int num) {
    return (double) 1 / sectors;
  }

  /**
   * Determines whether the spinner objects have landed on the same number in the last spin.
   *
   * @param spinner1 the first spinner object
   * @param spinner2 the second spinner object
   * @return true if both spinners have landed on the same number, false otherwise
   */
  public static boolean bothEqual(GameSpinner spinner1, GameSpinner spinner2) {
    return spinner1.getNum() == spinner2.getNum();
  }
}
