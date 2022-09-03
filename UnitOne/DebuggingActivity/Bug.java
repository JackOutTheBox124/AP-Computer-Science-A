package UnitOne.DebuggingActivity;

//EXTENSION: Add comments to explain what is happening
//Then fix the bug.

import java.util.Scanner;

/**
 * The type Bug.
 */
public class Bug
{
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("What is your age?");
    int age = scan.nextInt();

    System.out.println("What is your name?");
    String name = scan.nextLine();

    System.out.print("Hello, " + name +" age " + age );

  }
}