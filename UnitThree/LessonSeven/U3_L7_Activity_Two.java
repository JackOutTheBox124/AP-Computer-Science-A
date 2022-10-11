package UnitThree.LessonSeven;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter 2 words, then prints "Equal!" if the two words are the same (case-sensitive), "Different case" if the two words are the same (case-insensitive), “Close enough” if the two words are the same length and all but the last letter matches, and "Try again" otherwise.
 * <br>
 * Sample run 1:
 * <pre>
 * Enter 2 strings:
 * the
 * the
 * Equal!
 * </pre>
 * Sample run 2:
 * <pre>
 * Enter 2 strings:
 * The
 * the
 * Different case
 * </pre>
 * Sample run 3:
 * <pre>
 * Enter 2 strings:
 * that
 * than
 * Close enough
 * </pre>
 * Sample run 4:
 * <pre>
 * Enter 2 strings:
 * their
 * there
 * Try again
 * </pre>
 * Hint - for the "Close enough" condition you will need to see whether substrings of the two input String are the same. You can use the length and substring methods together to get the relevant substrings (all but the last character of each String).
 */
public class U3_L7_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String x = scan.nextLine();
    String y = scan.nextLine();

    if(x.equals(y)) {
      System.out.println("Equal!");
    }
    else if (x.toLowerCase().equals(y.toLowerCase())) {
      System.out.println("Different case");
    }
    else if (x.substring(0, x.length()-1).equals(y.substring(0, y.length()-1))) {
      System.out.println("Close enough");
    }
    else {
      System.out.println("Try again");
    }

  }
}
