package UnitSix.LessonOne;

import java.util.Scanner;

/**
 * The main method from this class contains code which is intended to fill an array of length 10 with the sums of the first n natural numbers,
 * then print the value of the number in the array at the index entered by the user.
 * For example if the user inputs 3 then the program should output 1 + 2 + 3 = 6,
 * while if the user inputs 6 then the program should output 1 + 2 + 3 + 4 + 5 + 6 = 21.
 * Debug this code so it works as intended.
 */
public class U6_L1_Activity_Two {
   public static void main(String[] args) {

     int[] h = new int[10]; // fixed array declaration

     h[0] = 1;
     h[1] = h[0] + 2;
     h[2] = h[1] + 3;
     h[3] = h[2] + 4; // fixed index to add previous element
     h[4] = h[3] + 5;
     h[5] = h[4] + 6;
     h[6] = h[5] + 7;
     h[7] = h[6] + 8;
     h[8] = h[7] + 9;
     h[9] = h[8] + 10; // fixed index to add previous element

     Scanner scan = new Scanner(System.in);
     int i = scan.nextInt();
     if (i > 0 && i <= 10)
       System.out.println(h[i-1]); // fixed index and output message
  }
}

/*
import java.util.Scanner;
public class U6_L1_Activity_Two
{
  public static void main(String[] args)
  {

    int[h] = new int(9);

    h[0] = 1;
    h[1] = h[0] + 2;
    h[2] = h[1] + 3;
    h[3] = h[1] + 4;
    h[4] = h[2] + 5;
    h[5] = h[3] + 6;
    h[6] = h[4] + 7;
    h[7] = h[5] + 8;
    h[8] = h[6] + 9;
    h[9] = h[7] + 10;

    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    if (i > 0 && i <= 10)
      System.out.println(h(i));
  }
}

 */