/* Lesson 3 Coding Activity Question 1 */

package UnitOne.LessonThree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that prompts a user to input three doubles and then prints these three doubles backward on the screen.
 * <p>
 * So if the user enters:
 * <pre>1.3 2.7 6.8</pre>
 * The program should output:
 *
 * <pre>6.8 2.7 1.3</pre>
 * Notice there is exactly one space between the numbers.
 */
public class CodingActivityQuestionOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> doubles = new ArrayList<>();

		System.out.println("Please input 3 doubles");

		 for(int i = 0; i < 3; i++) {
			doubles.add(scanner.nextDouble());
		 }

		System.out.println(doubles.get(2) + " " + doubles.get(1) + " " + doubles.get(0));
	}
}
