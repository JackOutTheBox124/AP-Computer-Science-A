package UnitFour.LessonThree;

/**
 * Use a for loop to print all of the numbers from 17 to 73 (inclusive) with 10 numbers on each line (the last line will have less than 10 numbers). Print one space between each number.
 * <br>
 * Hint - think about what values would be at the end of each line and what they have in common (think about modular division). You can then add an if block inside your loop which prints a new line when one of these numbers is encountered.
 */
public class U4_L3_Activity_Two {
  public static void main(String[] args) {
    for (int i = 17; i < 73 + 1; i++) {
      System.out.print(" " + i);
      if (i % 10 == 6) {
        System.out.println();
      }
    }
  }
}
