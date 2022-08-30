/* Lesson 1 Coding Activity Question 2 */

package UnitOne.LessonOne;

/**
 * Write a program which prints the phrase "Coding is fun!" three times.
 * Each time the program prints the phrase it should be on a new line and in the center of the output screen.
 * To pass the tests, your output must have at least one space before and after the phrase "Coding is fun!",
 * and have the same number of spaces before and after the phrase on each line.
 * See the sample run below for an example of this. Sample run:
 *
 * <pre>
 * {@code
 * Coding is fun!
 * Coding is fun!
 * Coding is fun!
 * }
 * </pre>
 */
public class CodingActivityQuestionTwo {
	public static void main(String[] args) {
		for(int x = 0; x<3; x++) {
			System.out.println(" Coding is fun! ");
		}
	}
}
