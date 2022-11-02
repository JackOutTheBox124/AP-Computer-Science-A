package UnitFour.PartnerProgramming;

import java.util.Scanner;

public class Backwards {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a string:");
    String str = scan.nextLine();
    int len = str.length();

    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(len-1));
      len--;
    }
  }
}
