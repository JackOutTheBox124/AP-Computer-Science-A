package UnitFour.LessonThree;

import java.util.Scanner;

public class U4_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive integer:");
    int y = scan.nextInt();
    if (y <= 0) {
      System.out.println("error");
    }
    else {
      for (int i = y; i >= 0; i--) {
        if (i % 3 == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
