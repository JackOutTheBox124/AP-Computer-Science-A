/* Lesson 2 Coding Activity Question 3 */

package UnitOne.LessonTwo;

import java.util.Scanner;

/**
 * Write a program that will ask the user to enter their name and the state they live in. Print the following sentence, replacing the ______ with the words they entered.
 * <p>
 * My name is _____. I live in _____.
 * </p>
 * Sample Run:
 * <pre>
 * Hi there. What is your name?
 * Dave
 * What state do you live in?
 * New York
 * My name is Dave. I live in New York.
 * </pre>
 */
public class CodingActivityQuestionThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hi there. What is your name?");
		String name = scanner.nextLine();
		System.out.println("What state do you live in?");
		String state = scanner.nextLine();
		System.out.println("My name is " + name + ". I live in " + state + ".");
	}
}
