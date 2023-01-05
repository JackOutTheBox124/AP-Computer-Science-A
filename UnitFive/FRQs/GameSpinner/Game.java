package UnitFive.FRQs.GameSpinner;

import java.util.Scanner;

/**
 * This class represents a game that has x options:
 * a slot machine or a double spinner.
 * <br>
 * The slot machine allows the player to spin a set of three {@link GameSpinner} objects and win credits if the numbers on all three spinners match and they land on the highest number possible (5 or whatever number the user enters).
 * The double spinner allows the player to spin two {@link GameSpinner} objects and win credits if the numbers on the two spinners match.
 */
public class Game {

  /**
   * The main method of the Game class which allows the player to select which game
   * they want to play and set the number of sectors for each {@link GameSpinner} object
   */
  public static void main(String[] args) {

    // Create a new Scanner object for user input
    Scanner scan = new Scanner(System.in);

    // Prompt the user to select a game
    System.out.println("""
            What game would you like to play?
            (1) - Slot Machine     (gambling is good (real))
            (2) - Double Spinner   (gambling is bad  (fake))
            (3) - Streak Spinner
            """);
    // Store the user's selection in the game variable
    int game = scan.nextInt();

    // Prompt the user to enter the number of sectors for each spinner
    System.out.println("How many sectors should each spinner have? Any number less than 3 will be set to 3.");
    // Store the user's input in the sectors variable
    int sectors = scan.nextInt();

    // Create an array of three GameSpinner objects with the specified number of sectors
    GameSpinner[] spinners = {
            new GameSpinner(sectors),
            new GameSpinner(sectors),
            new GameSpinner(sectors),
    };

    // Select the game based on the user's input
    switch (game) {
      case 1 ->
        // If the user selected the slot machine game, call the slotMachine method
              slotMachine(spinners, sectors);
      case 2 ->
        // If the user selected the double spinner game, call the doubleSpinner method
              doubleSpinner(spinners);
      case 3 ->
        // If the user selected the streak spinner game, call the streakSpinner method
              streakSpinner(spinners);
      default -> System.out.println("Goodbye!");
    }

  }

  /**
   * This method represents a game of chance where the player can spin three {@link GameSpinner}
   * objects and win credits if the numbers on all three spinners match.
   *
   * @param spinners an array of three {@link GameSpinner} objects
   */
  public static void slotMachine(GameSpinner[] spinners, int sectors) {
    // Create a new Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Set the number of credits to 100
    int credits = 100;
    // Continue the game as long as the player has credits remaining
    while (credits > 0) {
      // Prompt the user to spin the spinners
      System.out.println("You have " + credits + " credits. Spin? (y/n)");
      // Store the user's input in the input variable
      String input = scanner.nextLine();

      // If the user chose to spin, spin all three spinners and store the result in variables
      if (input.equals("y")) {
        // Spin the first spinner and store the result in num1
        int num1 = spinners[0].spin();
        // Spin the second spinner and store the result in num2
        int num2 = spinners[1].spin();
        // Spin the third spinner and store the result in num3
        int num3 = spinners[2].spin();
        // Print the result of the spin
        System.out.println("You spun: " + num1 + " " + num2 + " " + num3);

        // Check if all three numbers are the same
        if (num1 == num2 && num2 == num3 && num1 == sectors) {
          // If the numbers are the same and equal to the sector (the highest face value), the player wins 10 credits
          System.out.println("You won 10 credits!");
          credits += 10;
        } else {
          // If the numbers are not the same, the player loses 1 credit
          System.out.println("You lost 1 credit.");
          credits--;
        }
      } else {
        // If the user did not choose to spin, end the game
        break;
      }
    }
    // If the player has run out of credits, print a message
    if (credits == 0) {
      System.out.println("You ran out of credits!");
    }
    // Print a goodbye message
    System.out.println("Goodbye!");
  }

  /**
   * Simulates a gambling game where the player spins two "spinners" and wins credits if the numbers on the spinners are the same, and loses credits if the numbers are different. The player can keep playing as long as they have credits remaining.
   *
   * @param spinners an array of GameSpinner objects representing the spinners in the game
   */
  public static void doubleSpinner(GameSpinner[] spinners) {
    // Initialize the number of credits to 100
    int credits = 100;
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Loop as long as the player has credits remaining
    while (credits > 0) {
      // Prompt the user to spin the spinners
      System.out.println("You have " + credits + " credits. Spin? (y/n)");
      // Store the user's input in the input variable
      String input = scanner.nextLine();
      if (input.equals("y")) {
        // Spin both spinners
        spinners[0].spin();
        spinners[1].spin();
        // Print the numbers that were spun
        System.out.println("You rolled a " + spinners[0].getNum() + " and a " + spinners[1].getNum());
        if (GameSpinner.bothEqual(spinners[0], spinners[1])) {
          // If the numbers are the same, the player wins 10 credits
          System.out.println("You won 10 credits!");
          credits += 10;
        } else {
          // If the numbers are not the same, the player loses 1 credit
          System.out.println("You lost 1 credit.");
          credits--;
        }
      }
      // If the user input "n", break out of the loop
      else {
        break;
      }
    }
    // If the player has run out of credits, print a message
    if (credits == 0) {
      System.out.println("You ran out of credits!");
    }
    // Print a goodbye message
    System.out.println("Goodbye!");
  }


  /**
   * Simulates a gambling game where the player spins a GameSpinner object and wins credits if the number on the spinner is the same as the previous spin,
   * and loses credits if the number is different.
   * The player can keep playing as long as they have credits remaining.
   * @param spinners an array of GameSpinner objects representing the spinners in the game
   */
  public static void streakSpinner(GameSpinner[] spinners) {
    // Initialize the number of credits to 100
    int credits = 100;
    int runHighScore = 1;
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Loop as long as the player has credits remaining
    while (credits > 0) {
      // Prompt the user to spin the spinners
      System.out.println("You have " + credits + " credits. Spin? (y/n)");
      // Store the user's input in the input variable
      String input = scanner.nextLine();
      if (input.equals("y")) {
        // spins spinners twice so the loop will work
        spinners[0].spin();
        spinners[0].spin();
        // loop to spin the game spinner and check the current run against the high score
        // exits loop when the current run is broken
        while(spinners[0].currentRun() > 1) {
          if(spinners[0].currentRun() > runHighScore) runHighScore = spinners[0].currentRun();
          spinners[0].spin();
        }
        // Print the numbers that were spun
        System.out.println("Your streak was " + runHighScore);
        // Awards the player for a streak and deducts credits for a loss
        if(runHighScore > 1) {
          // The user receives 10 credits for each number in the streak
          System.out.println("You won " + (10 * runHighScore) + " credits!");
          credits += 10 * runHighScore;
        }
        else {
          // If the numbers are not the same, the player loses 10 credits
          System.out.println("You lost 10 credits");
          credits -= 10;
        }
        // resets the high score
        runHighScore = 1;
      }
      else break;

    }
    // If the player has run out of credits, print a message
    if (credits <= 0) {
      System.out.println("You ran out of credits!");
    }
    // Print a goodbye message
    System.out.println("Goodbye!");

  }
}