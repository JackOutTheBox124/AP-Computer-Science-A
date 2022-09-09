package UnitOne.PartnerProgramming;

import java.util.Scanner;

/**
 * Partner programming activity to create a program that converts a Fahrenheit temperature with an Integer typing into the Celsius equivalent with a Double typing
 * <br>
 * After the Celsius value is calculated, it checks to see if the Celsius value can correctly be converted back into the original Fahrenheit value
 */
public class TempConverter {
  public static void main(String[] args) {
    // Creates a new Scanner instance with the name scan
    Scanner scan = new Scanner(System.in);

    // Fahrenheit input
    System.out.println("Please enter a temperature in Fahrenheit:");
    int fahrenheit = scan.nextInt();
    System.out.println(fahrenheit);

    // Converts Fahrenheit input to celsius by subtracting 32 from it and multiplying the difference by 5/9
    double celsius = (fahrenheit - 32.0) * 5/9;
    System.out.println("The equivalent in Celsius is " + celsius);
    // Converts Celsius back to Fahrenheit by multiplying the celsius value by 9/5 and adding 32 to the product
    int fCheck = (int) (celsius * 9/5) + 32;
    System.out.println("Calculation check: " + celsius + " equals " + fCheck + " degrees Fahrenheit.");
  }
}