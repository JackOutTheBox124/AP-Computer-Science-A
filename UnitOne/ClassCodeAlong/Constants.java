package UnitOne.ClassCodeAlong;

//import java.lang.Math;
import java.util.Scanner;

import java.text.NumberFormat;

public class Constants
{
  public static void main(String[]args)
  {

    Scanner scan = new Scanner(System.in);

    //System.out.print(Math.PI);

    final double TAX_RATE = .075;

    System.out.println("Enter the cost of your item: ");
    double cost = scan.nextDouble();

//TAX_RATE = .08;  Cannot change the value of a constant!

    double totalCost = cost*TAX_RATE + cost;

    System.out.println("You owe $" + totalCost + " with tax.");



    //Different ways to format numbers!! Not tested on AP exam.

    System.out.printf("You owe $%.2f with tax.",totalCost);
    System.out.println();
//
//
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    System.out.println("You owe " + currency.format(totalCost) + " with tax.");
  }
}