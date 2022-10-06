package UnitTwo.PartnerProgramming;

import java.util.Scanner;

/**
 * Write a program called Switched.java that asks the user to enter a word.
 * Then divide the word in half and output the new word that is the last half of the word switched with the first half of the word.
 * @author Jack
 */
public class Switched {
  public static void main(String[] args) {
    // creates new scanner
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word:");
    // saves user input to variable
    String word = scan.nextLine();
    // prints out length of word and length of the first half of the word
    System.out.println("The length of the word is " + word.length());
    System.out.println("The first half of the word is " + (word.length() / 2) + " characters.");
    // prints out the second half of the original word concatenated to the end of the first half of the original word
    System.out.println("The new word is: " + (word.substring(word.length() / 2)) + (word.substring(0, word.length() / 2)));
  }
}
