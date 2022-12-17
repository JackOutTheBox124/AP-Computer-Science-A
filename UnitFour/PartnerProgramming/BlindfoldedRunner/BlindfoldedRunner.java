package UnitFour.PartnerProgramming.BlindfoldedRunner;

import java.util.Random;

public class BlindfoldedRunner {
  public static void main(String[] args) {
    // creates new random instance
    Random random = new Random();
    // sets default position
    int pos = 5;
    // if the argument random is passed through, the spawning location is randomized
    if(args.length > 0) {
      if (args[0].equalsIgnoreCase("random")) {
        pos = random.nextInt(11);
      }
    }
    // count starts at -1 to account for count increasing before a step is taken
    int count = -1;
    // base string for every step
    StringBuilder string = new StringBuilder("|           |");

    while (0 <= pos && pos <= 10) {
      // prints X in current location
      string.setCharAt(pos + 1, 'X');
      System.out.println(string);
      string.setCharAt(pos + 1, ' ');
      // generates random number to determine which direction the runner goes
      switch (random.nextInt(3)) {
        case 0 -> pos -= 1;
        case 2 -> pos += 1;
      }
      // increases steps by one
      count++;
      // generates random number and if its equal to the position of the runner, it crashes
      if(random.nextInt(11) == pos) {
        break;
      }
    }
    // prints out steps taken by runner
    System.out.println("Crash! Steps Taken: " + count);
  }
}