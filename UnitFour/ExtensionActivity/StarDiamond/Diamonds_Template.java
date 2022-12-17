package UnitFour.ExtensionActivity.StarDiamond;

//StarDiamonds
//Author: Teacher

import java.util.Scanner;

public class Diamonds_Template
{
  public static void main (String args[])
  {
    Scanner scan = new Scanner(System.in);
    boolean quit = false;
    int menuSelection;

    do
    {

      //if text is the same in the menu, this could be a for loop as well!
      System.out.println();
      System.out.println("[1] Diamond Activity(Easy) - Align left, number of rows equal columns");
      System.out.println("[2] Diamond Activity(Moderate)-Align left, stars printed descrease by 1 each row");
      System.out.println("[3] Diamond Activity (Moderately hard)- Aligned right, stars printed decrease by 1 each row");
      System.out.println("[4] Diamond Activity (Hard)- Aligned center, stars printed increasing by odd numbers until get to # entered");
      System.out.println("[5] Diamond Activity(Challenge)- Aligned center, stars printed increasing by odd numbers until get to # entered, the reversed");
      System.out.println("[0] Quit");
//User enters their choice

      menuSelection = scan.nextInt();

      //find the variable value in the parameters
      switch(menuSelection) //put values that are possible after the word "case"
      {
//selection #1
        case 1:
          System.out.println("Select an odd number of stars you would like to print:");
          Scanner num1 = new Scanner(System.in);

          break;
//selection #2
        case 2:
          System.out.println("Select an odd number of stars you would like to print:");
          Scanner num2 = new Scanner(System.in);

          break;

//selection #3
        case 3:
          System.out.println("Select an odd number of stars you would like to print:");
          Scanner num3 = new Scanner(System.in);

          break;
//Selection #4
        case 4:
          System.out.println("Select an odd number of stars you would like to print:");
          Scanner num4 = new Scanner(System.in);

          break;
        //Selection #5
        case 5:
          System.out.println("Select an odd number of stars you would like to print:");
          Scanner num5 = new Scanner(System.in);

          break;

//Quit
        case 0:
          quit = true;
          break;
//no valid selection made
        default: //if none of the values are true this is what we do
          System.out.println("Enter a valid selection");
          break;
      }
    }
    while(!quit);
  }
}