package UnitFive.ClassCodingActivities.CoinClasses;

public class CountFlips {
  public static void main(String[] args) {
    final int NUM_FLIPS = 1000;

    int numHeads = 0;
    int numTails = 0;

    Coin c = new Coin();
    // Flip the coin NUM_FLIPS times and count the number of heads and tails.
    for (int i = 0; i < NUM_FLIPS; i++) {
      c.flip();
      if (c.isHeads()) numHeads++;
      else numTails++;
    }

    // Print the results.
    System.out.println("Number of flips is: " + NUM_FLIPS);
    System.out.println("The number of heads is: " + numHeads);
    System.out.println("The number of tails is: " + numTails);

    // Calculate the percentage of heads and tails.
    double headPercentage = (double) numHeads / NUM_FLIPS * 100;
    double tailPercentage = (double) numTails / NUM_FLIPS * 100;

    // Print the percentages.
    System.out.println("The percentage of heads flipped is: " + headPercentage + "%");
    System.out.println("The percentage of tails flipped is: " + tailPercentage + "%");
  }
}
