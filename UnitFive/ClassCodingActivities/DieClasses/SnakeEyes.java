package UnitFive.ClassCodingActivities.DieClasses;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Rolls two dice 6000 times
 * if the sum of the two dice is 2, then it is a snake eyes and the counter is incremented by 1
 * the program then outputs the number of snake eyes rolled and the percentage of snake eyes rolled
 */
public class SnakeEyes {
  public static void main(String[] args) {

    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.DOWN);

    // This is the amount of times the dice are rolled
    final int NUM_ROLLS = 6000;
    // Counter variable
    int snakeEyes = 0;

    // Creates two Die objects
    Die dieOne = new Die();
    Die dieTwo = new Die();

    // loops NUM_ROLLS times, rolling the dice and checking if the sum of the two dice is 2
    for (int i = 0; i < NUM_ROLLS; i++) {
      // rolls each dice
      dieOne.roll();
      dieTwo.roll();

      // checks the value of the two dice and increments the counter if the sum is 2
      if ((dieOne.getValue() + dieTwo.getValue()) == 2) {
        snakeEyes++;
      }
    }
    //among us sussy baka uwu daddy kink 69 420 blaze it 666 satan my name jeff 911 was an inside job
    // the walls are closing in on me i can't breathe i'm suffocating i'm dying i'm dead
    // bush did 9/11
    // donald trump is a lizard person
    // outputs the number of snake eyes rolled and the percentage of snake eyes rolled
    System.out.println("Rolled the dice " + NUM_ROLLS + " times");
    System.out.println("There were " + snakeEyes + " Snake Eyes rolled");
    System.out.println("The percentage of rolls that had Snake Eyes is " +  df.format((double) snakeEyes / NUM_ROLLS * 100) + "%");
  }
}