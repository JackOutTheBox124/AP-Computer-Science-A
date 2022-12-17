package UnitFour.LessonFive;

/**
 * Write code which prints every number from 10 to 1 a number of times equal to the number itself (e.g. ten 10’s, nine 9's...). Every individual number printed should be separated by a space, and there should be a new line each time the number changes. You should use nested loops to produce your output (it will result in far less code).
 * <br>
 * Partial sample run:
 * <pre>
 * 10 10 10 10 10 10 10 10 10 10
 * 9 9 9 9 9 9 9 9 9
 * 8 8 8 8 8 8 8 8
 * ........
 * </pre>
 */
public class U4_L5_Activity_Two {
  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
