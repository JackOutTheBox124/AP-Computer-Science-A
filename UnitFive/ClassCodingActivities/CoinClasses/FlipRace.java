package UnitFive.ClassCodingActivities.CoinClasses;

public class FlipRace {
  public static void main(String[] args) {
    final int GOAL = 3;

    // Create two coins.
    Coin coinOne = new Coin();
    Coin coinTwo = new Coin();

    int coinOneCount = 0;
    int coinTwoCount = 0;

    // Flip the coins until one of them reaches GOAL heads.
    while (true) {
      coinOne.flip();
      coinTwo.flip();

      // Increment the count of the coin that was flipped.
      if(coinOne.isHeads()) coinOneCount++;
      // Reset the count of a coin if it is tails.
      else coinOneCount = 0;
      if(coinTwo.isHeads()) coinTwoCount++;
      else coinTwoCount = 0;

      // Print the coin states
      System.out.println("Coin 1: " + coinOne.toString() + "\tCoin 2: " + coinTwo.toString());

      // Check if either coin has reached GOAL heads and exits the loop if so.
      if(coinOneCount == GOAL) {
        System.out.println("Coin One wins!");
        break;
      }
      if(coinTwoCount == GOAL) {
        System.out.println("Coin Two wins!");
        break;
      }
    }


  }
}
