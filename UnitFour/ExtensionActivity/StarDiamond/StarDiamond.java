package UnitFour.ExtensionActivity.StarDiamond;

import java.util.Scanner;

public class StarDiamond {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean quit = false;
    int menuSelection;

    while(!quit) {
      System.out.println();
      System.out.println("[1] Diamond Activity (Easy)            - Align left, number of rows equal columns");
      System.out.println("[2] Diamond Activity (Moderate)        - Align left, stars printed descrease by 1 each row");
      System.out.println("[3] Diamond Activity (Moderately hard) - Aligned right, stars printed decrease by 1 each row");
      System.out.println("[4] Diamond Activity (Hard)            - Aligned center, stars printed increasing by odd numbers until get to # entered");
      System.out.println("[5] Diamond Activity (Challenge)       - Aligned center, stars printed increasing by odd numbers until get to # entered, the reversed");
      System.out.println("[0] Quit");

      menuSelection = scan.nextInt();

      if (menuSelection > 0) {
        System.out.println("Select an odd number of stars you would like to print:");
      }
      switch(menuSelection) {
        case 1:
          activityOne(scan.nextInt());
          break;
        case 2:
          activityTwo(scan.nextInt());
          break;
        case 3:
          activityThree(scan.nextInt());
          break;
        case 4:
          activityFour(scan.nextInt());
          break;
      }
    }

  }

  public static void activityOne(int num) {
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void activityTwo(int num) {
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void activityThree(int num) {
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int l = 0; l < num-i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void activityFour(int num) {

    boolean skip = false;
    for (int i = 0; i < num; i++) {
      if(!skip) {
        for (int j = 0; j < (num - i) / 2; j++) {
          System.out.print("X");
          for (int k = 0; k < (2*j)-num; k++) {
            System.out.print("*");
          }
          System.out.println("X");
        }

        skip = true;
      }
      else {
        skip = false;
      }

    }
  }
}
