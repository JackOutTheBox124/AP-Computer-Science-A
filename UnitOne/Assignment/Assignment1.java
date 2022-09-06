/* Assignment 1 - Calculating Grades */

package UnitOne.Assignment;

import java.util.Scanner;

/**
 * Program that calculates a student's final course grade based on the student's homework, quiz, and final exam scores
 * <p>
 * The overall grade is calculated as a weighted average with the following weights:
 * <ul>
 *   <li>Average homework grade - 35%</li>
 *   <li>Average quiz grade - 15%</li>
 *   <li>Final exam grade - 50%</li>
 * </ul>
 * @author Jack
 */
public class Assignment1 {
  public static void main(String[] args) {
    // Creates a new Scanner instance with the name scan
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the course name.");
    String courseName = scan.nextLine();

    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    int averageMinutesTotal = scan.nextInt();

    System.out.println("Please enter the homework grades for this course.");
    // Calculates the homework average by scanning the next 4 Integer values entered and dividing the sum of all of them by 4
    double homeworkAverage = (scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt()) / 4.0;

    System.out.println("Please enter the quiz grades for this course.");
    // Calculates the quiz average by scanning the next 2 Double values entered and dividing the sum of all of them by 2
    double quizAverage = (scan.nextDouble() + scan.nextDouble()) / 2;

    System.out.println("Please enter the final exam grade for this course.");
    double finalExamGrade = scan.nextDouble();

    System.out.println("Course name: " + courseName);
    // Since the value of the variable averageMinutesTotal is an Integer, dividing it by 60 will leave a whole number. Modding the variable by 60 will leave the remaining minutes which is added to the string
    System.out.println("Weekly time spent: " + averageMinutesTotal / 60 + "h" + averageMinutesTotal % 60);
    System.out.println("Average homework grade: " + homeworkAverage);
    System.out.println("Average quiz grade: " + quizAverage);
    System.out.println("Final exam grade: " + finalExamGrade);
    // Weighs the overall grade by multiplying each of the 3 scores by their respective weight values (the weights have been divided by 100 for simplicity)
    System.out.println("Overall grade: " + Math.round((homeworkAverage * .35) + (quizAverage * .15) + (finalExamGrade * .50)));
  }
}
