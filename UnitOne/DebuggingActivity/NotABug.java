package UnitOne.DebuggingActivity;

import java.util.Scanner;

/**
 * The type Not a bug.
 */
public class NotABug {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("What is your name?");
    String name = scan.nextLine();

    System.out.print("What is your age?");
    int age = scan.nextInt();

    System.out.print("Hello, " + name +" age " + age );
  }
}