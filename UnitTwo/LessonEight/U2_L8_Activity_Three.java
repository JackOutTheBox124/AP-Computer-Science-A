package UnitTwo.LessonEight;

import java.util.Scanner;

public class U2_L8_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two doubles:");
    double one = scan.nextDouble();
    double two = scan.nextDouble();
    System.out.println("Difference: " + (Math.round(Math.abs(one - two))));

  }
}
