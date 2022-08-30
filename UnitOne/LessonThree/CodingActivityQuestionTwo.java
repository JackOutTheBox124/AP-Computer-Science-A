/* Lesson 3 Coding Activity Question 2 */

package UnitOne.LessonThree;

import java.util.Scanner;
/**
 * Write a program that asks the user their name and age and prints out this information in a sentence as shown. Note that age should be an integer, not a double.
 * <p>
 * Sample run:
 * <pre>
 * Hi there. What is your name?
 * Pascal
 * Hi Pascal. How old are you?
 * 16
 * Pascal is 16 years old.
 * </pre>
 */
public class CodingActivityQuestionTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi there. What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + ". How old are you?");
		int age = scanner.nextInt();
		System.out.println(name + " is " + age + " years old.");
	}
}
