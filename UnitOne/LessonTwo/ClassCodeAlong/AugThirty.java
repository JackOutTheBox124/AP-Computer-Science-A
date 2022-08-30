package UnitOne.LessonTwo.ClassCodeAlong;

import java.util.Scanner;

/**
 * Start a class from scratch and demo the Scanner class and the nextLine() Scanner method in that class.
 * @since 30-AUG-2022
 */
public class AugThirty {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name = "Bob";
    System.out.println("Enter your name: ");
    name = scanner.nextLine();

    System.out.println("Hello " + name);

    System.out.println("Enter a number: ");
    int x = scanner.nextInt();
    System.out.println("Num " + x);
  }
}
