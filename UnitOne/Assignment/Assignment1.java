/* Assignment 1 - Calculating Grades */

package UnitOne.Assignment;

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the course name.");
    String courseName = scan.nextLine();

    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    int averageMinutesTotal = scan.nextInt();

    System.out.println("Please enter the homework grades for this course.");
    double homeworkAverage = (scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt()) / 4.0;

    System.out.println("Please enter the quiz grades for this course.");
    double quizAverage = (scan.nextDouble() + scan.nextDouble()) / 2;

    System.out.println("Please enter the final exam grade for this course.");
    double finalExamGrade = scan.nextDouble();

    System.out.println("Course name: " + courseName);
    System.out.println("Weekly time spent: " + averageMinutesTotal/60 + "h" + averageMinutesTotal%60);
    System.out.println("Average homework grade: " + homeworkAverage);
    System.out.println("Average quiz grade: " + quizAverage);
    System.out.println("Final exam grade: " + finalExamGrade);
    System.out.println("Overall grade: " + Math.round((homeworkAverage * .35) + (quizAverage * .15) + (finalExamGrade * .50)));
  }
}
