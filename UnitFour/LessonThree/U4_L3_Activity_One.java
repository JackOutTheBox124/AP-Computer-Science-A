package UnitFour.LessonThree;

/**
 * Use a for loop to print the odd numbers between 1 and 25 (including 1 and 25). Print each number on a new line.
 */
public class U4_L3_Activity_One {
  public static void main(String[] args) {
    for (int i = 0; i < 25; i++) {
      if ((i + 1) % 2 == 1) {
        System.out.println(i + 1);
      }
    }
  }
}
