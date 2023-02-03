package UnitSix.LessonOne;

import java.util.Scanner;

/**
 * Debug the code in the main method of this class, which is intended to initialize an array named arr to hold 3 doubles, fill the array with 3 inputs from the user, then print the contents of the array in order followed by the sum of the 3 doubles.
 */
public class U6_L1_Activity_One
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);

    double[] arr = new double[3];
    arr[0] = scan.nextDouble();
    arr[1] = scan.nextDouble();
    arr[2] = scan.nextDouble();

    System.out.println("Contents: " + arr[0] + " " + arr[1] + " " + arr[2]);
    System.out.println("Sum: " + (arr[0] + arr[1] + arr[2]));

  }
}

/*
import java.util.Scanner;

public class U6_L1_Activity_One
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);

    double[] arr = new int(3);
    arr[1] = scan.nextDouble();
    arr[2] = scan.nextDouble();
    arr[3] = scan.nextDouble();

    System.out.println("Contents: " + arr(1) + " " + arr(2) + " " + arr(3));
    System.out.println("Sum: " + arr[1] + arr[2] + arr[3]);

  }
}
 */
