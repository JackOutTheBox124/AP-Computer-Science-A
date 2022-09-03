package UnitOne.DebuggingActivity;

//EXTENSION: Add comments to explain what is happening
//Then fix the bug.

import java.util.Scanner;

/**
 * Debugged version of {@link Bug Bug.java}
 */
public class Debugged {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your age?");
    int age = scan.nextInt();
    // When you enter a number for the Scanner.nextInt() method, it reads the Integer value but not the newline value from when you press the Enter key so when you use the Scanner.nextLine() method, it immediately consumes the newline left from a user inputting their age
    // By adding the Scanner.nextLine() method below, it consumes the newline character left from the Integer value was entered so that when the user is prompted to enter their name, the Scanner.nextLine() method does not consume the previous newline
    scan.nextLine();

    System.out.println("What is your name?");
    String name = scan.nextLine();

    System.out.println("Hello, " + name +" age " + age );

  }
}