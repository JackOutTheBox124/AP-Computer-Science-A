package UnitOne.LessonThree;

import java.util.Scanner;

/**
 * Write a short quiz program which asks two true/false questions and stores the user's answers as booleans. At the end of the program it should print the user's answers with the correct answers.
 * <p>
 * Note: you should use the same quiz questions and correct answers as the sample run below.
 * <p>
 * Sample run:
 * <pre>
 * Java is an object-oriented programming language, true or false?
 * true
 * There are only 2 possible values which can be held by a boolean variable, true or false?
 * false
 *
 * Question 1 - Your answer: true. Correct answer: true
 * Question 2 - Your answer: false. Correct answer: true
 * </pre>
 */
public class CodingActivityQuestionThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Java is an object-oriented programming language, true or false?");
		boolean questionOne = scanner.nextBoolean();
		System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
		boolean questionTwo = scanner.nextBoolean();

		System.out.println("Question 1 - Your answer: " + questionOne + ". Correct answer: true");
		System.out.println("Question 2 - Your answer: " + questionTwo + ". Correct answer: true");
	}
}
