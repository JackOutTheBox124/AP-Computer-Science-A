package UnitThree.Assignment;

import java.util.Scanner;

public class Assignment3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome. What is your name?");
    String name = scan.nextLine();
    System.out.println("Hello " + name + ". Are you ready to crack the code?");
    boolean ready = (scan.nextLine().equalsIgnoreCase("yes"));
    if(ready) {
      System.out.println("/nPHASE 1\nEnter a string:");
      boolean phase1Correct = scan.nextLine().length() == 3;

      if(phase1Correct) {
        System.out.println("Correct!");
        System.out.println("\nPHASE 2\nEnter a number:");
        int num1 = scan.nextInt();
        boolean phase2Correct = (num1 == 19) || (35 <= num1 && num1 < 78);
        if(phase2Correct) {
          System.out.println("Correct!");
          System.out.println("PHASE 3\nEnter a number:");
          int num2 = scan.nextInt();
          boolean phase3Correct = (num2 > 0) && (num2 % 2 == 0 || num2 % 10 == 1);
          if(phase3Correct) {
            System.out.println("Correct!\nYou have cracked the code!");
          }
          else {
            System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
          }
        }
        else {
          System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
        }
      }
      System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
    }
  }
}
