package UnitFive.FRQs.GameSpinner;


import java.util.ArrayList;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What game would you like to play?\n" +
            "(1) - Slot Machine (gambling is good (real))\n" +
            "(2) - ");






    System.out.println("How many sectors should each spinner have?");
    int sectors = scan.nextInt();

    while (sectors <= 0) {
      System.out.println("Please enter a number greater than 0!");
      sectors = scan.nextInt();
    }



    GameSpinner[] spinners = {
      new GameSpinner(sectors),
      new GameSpinner(sectors),
      new GameSpinner(sectors),
    };



    for (int i = 0; i < 20; i++) {
      for (GameSpinner spinner:spinners) {
        while (spinner.currentRun() <= 5) {
          spinner.spin();
        }
        // spinner.spin();
        System.out.println(spinner.currentRun());
      }
    }


  }


  public static class symbols {
    public static final int cherries =    1;
    public static final int bells =       2;
    public static final int watermelons = 3;
    public static final int lemons =      4;
    public static final int plums =       5;
    public static final int oranges =     6;
    public static final int grapes =      7;
    public static final int ace =         8;
    public static final int sevens =      9;
    public static final int diamonds =   10;

/*    String[] symbols = {
      "cherries",
              "bells",
              "sevens",
              "bars",
              "watermelons",
              "lemons",
              "plums",
              "oranges",
              "grapes",
              "diamonds",
    };

 */
  }
  public int slotMachine() {


    GameSpinner[] machineReels = {
      new GameSpinner(10),
      new GameSpinner(10),
      new GameSpinner(10),
    };

    for (GameSpinner spinner:machineReels) {
      spinner.spin();
    }

    if (machineReels[0].getNum() == machineReels[1].getNum() &&
    machineReels[0].getNum() == machineReels[2].getNum()) {

      switch (machineReels[0].getNum()) {
        case symbols.cherries -> {
          return 10;
        }
        case symbols.bells -> {
          return 20;
        }
      }
      if(machineReels[0].getNum() == symbols.cherries) {
        return 10;
      }

    }
    else if ()
  }



  public static boolean moreThanOnce(ArrayList<Integer> arrayList, int searched)
  {
    int numCount = 0;

    for (int thisNum : arrayList) {
      if (thisNum == searched) numCount++;
    }

    return numCount > 1;
  }

}


