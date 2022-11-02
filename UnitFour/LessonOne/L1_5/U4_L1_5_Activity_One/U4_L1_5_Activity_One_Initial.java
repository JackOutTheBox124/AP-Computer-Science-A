package UnitFour.LessonOne.L1_5.U4_L1_5_Activity_One;

import java.util.Scanner;

/**
 * The code provided is intended to use a while loop to print the first 5 multiples of an integer entered by the user. For example, if the user enters 5, the program should print the numbers 5, 10, 15, 20, and 25, one per line. Debug the code so it functions as described.
 */
public class U4_L1_5_Activity_One_Initial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int fac = 1;
    while(fac < 5){
      fac++;
      System.out.println(num*fac);
    }
  }
}
