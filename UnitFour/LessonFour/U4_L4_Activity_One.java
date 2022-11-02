package UnitFour.LessonFour;

import java.util.Scanner;

/**
 * Write a program which takes a String input and then prints the number of times the letter p is followed by a vowel (y is not considered a vowel here). The letter p, and the vowel that follows, may be upper or lower case.
 * <br>
 * Hint - remember there are String methods which return a copy of the String it is called on with all letter characters changed to the same case.
 * <br>
 * Sample run
 * <pre>
 * Input String:
 * Peter Piper picked a pack of pickle peppers.
 * Contains p followed by a vowel 8 times.
 * </pre>
 */
public class U4_L4_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input String:");
    String inp  = scan.nextLine();
    String inpLower = inp.toLowerCase();

    int count = 0;
    for (int i = 0; i < inpLower.length(); i++){
      if (inpLower.charAt(i) == 'p'){
        if (inpLower.charAt(i + 1) == 'a' || inpLower.charAt(i + 1) == 'e' || inpLower.charAt(i + 1) == 'i' || inpLower.charAt(i + 1) == 'o' || inpLower.charAt(i + 1) == 'u') {
          count++;
        }
      }
    }
    System.out.println("Contains p followed by a vowel " + count + " times.");
  }
}